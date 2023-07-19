package com.mynemo.nemo.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository("testDAO")
public class TestDAOImpl implements TestDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int selectTest() throws DataAccessException {
		return sqlSession.selectOne("mapper.test.selectTest");
	}

}
