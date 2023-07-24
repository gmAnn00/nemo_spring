package com.mynemo.nemo.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynemo.nemo.common.dao.IndexDAO;
import com.mynemo.nemo.group.vo.GroupVO;
import com.mynemo.nemo.test.dao.TestDAO;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private TestDAO testDAO;
	
	@Autowired
	private IndexDAO indexDAO;
	
	@Override
	public int selectTest() throws Exception {
		return testDAO.selectTest();
	}

	//비 로그인시 추천 소모임 받아오는 메소드
	@Override
	public List<GroupVO> getRandomGroupList() throws Exception {
		return indexDAO.getRandomGroupList();
		//return null;
	}

}
