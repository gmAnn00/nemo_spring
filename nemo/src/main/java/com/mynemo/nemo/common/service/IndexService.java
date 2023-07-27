package com.mynemo.nemo.common.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mynemo.nemo.group.vo.GroupVO;

public interface IndexService {
	
	public int selectTest() throws Exception;
	
	//비 로그인 시 랜덤으로 그룹 리스트를 받아오는 서비스
	public List<GroupVO> getRecommendGroupList() throws Exception;
	
	//로그인 했을 때 관심사를 기준으로 그룹 리스트를 받아오는 서비스 
	public List<GroupVO> getInterestsGroupList(String user_id) throws Exception;
	
	//회원의 주소를 가져오는 메소드
	public String getUserAddr(String user_id) throws DataAccessException;
		
	public List<GroupVO> getNearGroupList(String user_id) throws Exception;
		
}
