package com.mynemo.nemo.common.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mynemo.nemo.group.vo.GroupVO;

public interface IndexDAO {
	
	//비로그인시 랜덤으로 추천 소모임 가져오는 메소드
	public List<GroupVO> getRandomGroupList() throws DataAccessException;
	
}
