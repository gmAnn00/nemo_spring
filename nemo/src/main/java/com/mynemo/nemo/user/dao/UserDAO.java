package com.mynemo.nemo.user.dao;

import org.springframework.dao.DataAccessException;

public interface UserDAO {
	
	//회원의 주소를 가져오는 메소드
	public String getUserAddr(String user_id) throws DataAccessException;
}
