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
	
	
	@Override
	public List<GroupVO> getRandomGroupList() throws DataAccessException{
		//List<GroupVO> groupList=null;
		//groupList=sqlSession.selectList("mapper.index.selectRamdomGroupList");
		//return groupList;
		return null;
	}

}
