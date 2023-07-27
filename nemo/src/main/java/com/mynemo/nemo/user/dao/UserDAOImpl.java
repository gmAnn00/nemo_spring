package com.mynemo.nemo.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//user_id로 user의 주소를 받아오는 메소드
	@Override
	public String getUserAddr(String user_id) throws DataAccessException {
		String user_addr=null;
		user_addr=sqlSession.selectOne("mapper.user.selectUserAddr", user_id);
		return user_addr;
	}
}
