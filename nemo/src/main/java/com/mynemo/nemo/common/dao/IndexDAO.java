package com.mynemo.nemo.common.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mynemo.nemo.group.vo.GroupVO;

public interface IndexDAO {
	
	//비로그인시 랜덤으로 추천 소모임 가져오는 메소드
	public List<GroupVO> getRecommendGroups() throws DataAccessException;
	
	//회원의 관심사로 소모임을 가져오는 메소드
	public List<GroupVO> getInterestsGroups(String user_id) throws DataAccessException;
	
	//user_id로 user_addr1을 받아오는 메소드
	public String getUserAddr(String user_id) throws DataAccessException;
	
	//회원의 주소(위치)로 가까운 소모임을 가져오는 메소드
	public List<GroupVO> getNearGroups(String user_addr) throws DataAccessException;
}
