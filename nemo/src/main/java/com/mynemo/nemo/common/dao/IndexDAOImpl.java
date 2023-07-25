package com.mynemo.nemo.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

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

}
