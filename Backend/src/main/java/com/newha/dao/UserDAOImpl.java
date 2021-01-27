package com.newha.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newha.mapper.UserMapper;
import com.newha.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	UserMapper mapper;

	@Override
	public ArrayList<User> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public void insert(User u) {
		mapper.insert(u);
	}

	@Override
	public void delete(String id) {
		mapper.delete(id);
	}

	@Override
	public void update(User u) {
		mapper.update(u);
	}

	@Override
	public User selectOne(User u) {
		return mapper.selectOne(u);
	}
	
	@Override
	public User selectOneById(String id) {
		return mapper.selectOneById(id);
	}
}
