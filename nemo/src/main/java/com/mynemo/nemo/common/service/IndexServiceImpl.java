package com.mynemo.nemo.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynemo.nemo.test.dao.TestDAO;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private TestDAO testDAO;
	
	@Override
	public int selectTest() throws Exception {
		return testDAO.selectTest();
	}

}
