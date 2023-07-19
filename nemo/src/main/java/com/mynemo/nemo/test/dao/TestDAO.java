package com.mynemo.nemo.test.dao;

import org.springframework.dao.DataAccessException;

public interface TestDAO {
	public int selectTest() throws DataAccessException;
}
