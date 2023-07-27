package com.mynemo.nemo.common.dao;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mynemo.nemo.common.location.KaKaoGeoRes;
import com.mynemo.nemo.group.vo.GroupVO;

@Repository("indexDAO")
public class IndexDAOImpl implements IndexDAO {
	@Autowired
	private SqlSession sqlSession;
	
	
	//비 로그인 시 추천 소모임을 랜덤하게 받아오는 메소드
	@Override
	public List<GroupVO> getRecommendGroups() throws DataAccessException{
		List<GroupVO> recommendGroupList=null;
		recommendGroupList=sqlSession.selectList("mapper.index.selectRecommendGroups");
		return recommendGroupList;
		//return null;
	}

	//로그인 했을때 관심사를 기준으로 소모임을 랜덤하게 받아오는 메소드
	@Override
	public List<GroupVO> getInterestsGroups(String user_id) throws DataAccessException {
		List<GroupVO> interestsGroupList=null;
		interestsGroupList=sqlSession.selectList("mapper.index.selectInterestsGroups", user_id);
		return interestsGroupList;
	}
	
	//user_id로 user의 주소를 받아오는 메소드
	@Override
	public String getUserAddr(String user_id) throws DataAccessException {
		String user_addr=null;
		user_addr=sqlSession.selectOne("mapper.index.selectUserAddr", user_id);
		return user_addr;
	}

	@Override
	public List<GroupVO> getNearGroups(String user_addr) throws DataAccessException {

		List<GroupVO> groupList=null;
		groupList=sqlSession.selectList("mapper.group.selectAllGroupList");
		
		double userLat=0.0;
		double userLng=0.0;
		String APIKey = "KakaoAK c73306afc68803d77548f1b3dea5d5c2";
		try {
			
			String address = user_addr;
			String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" 
                    + URLEncoder.encode(address, "UTF-8");
			
			HttpResponse<JsonNode> response = Unirest.get(apiURL).header("Authorization", APIKey).asJson();
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			
			// 카카오로컬에서 받은 json 정보를 클래스로 바꿔줌
			KaKaoGeoRes bodyJson = objectMapper.readValue(response.getBody().toString(), KaKaoGeoRes.class);
		
			if(bodyJson.getDocuments().size() != 0) {
				userLat = bodyJson.getDocuments().get(0).getY();
				userLng = bodyJson.getDocuments().get(0).getX();
			}
			
			
		} catch (Exception e) {
			System.out.println("회원 주소를 위도/경도로 바꾸는 도중 에러");
			e.printStackTrace();
		}
		
		
		
		for(int i = groupList.size()-1; i>=0; i--) {
			try {
				GroupVO group = (GroupVO) groupList.get(i);
				String address = group.getGroup_addr1();
				String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" 
	                    + URLEncoder.encode(address, "UTF-8");
				
				HttpResponse<JsonNode> response = Unirest.get(apiURL).header("Authorization", APIKey).asJson();
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
				
				KaKaoGeoRes bodyJson = objectMapper.readValue(response.getBody().toString(), KaKaoGeoRes.class);
			
				double lat = 0.0;
				double lng = 0.0;
				
				if(bodyJson.getDocuments().size() > 0) {
					System.out.println("bodyJson="+bodyJson.getDocuments().size());
					lat = bodyJson.getDocuments().get(0).getY();
					lng = bodyJson.getDocuments().get(0).getX();
				}
				
				
				System.out.println("lat = " + lat);
				System.out.println("lng = " + lng);
				
				double dLat = Math.toRadians(userLat - lat);
				double dLng = Math.toRadians(userLng - lng);
				
				double temp1 = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(Math.toRadians(lat))*
						Math.cos(Math.toRadians(userLat/2))*Math.sin(dLng/2)*Math.sin(dLng/2);
				double temp2 = 2 * Math.atan2(Math.sqrt(temp1), Math.sqrt(1-temp1));
				double dist = 6371 * temp2 * 1000;
				System.out.println("dist="+ dist);
				
				if(dist > 2000) {
					groupList.remove(i);
				}
				
			} catch (Exception e) {
				System.out.println("위도경도로 가까운 소모임 찾는 중 에러 ");
				e.printStackTrace();
			}
				
		} // end of for
		
		//groupList를 랜덤으로 섞기 
		Collections.shuffle(groupList);
		
		//groupList가 4개보다 많을때 
		if(groupList.size() > 4) {
			groupList = groupList.subList(0, 4);
		}
	
		return groupList;
	}
	
}
