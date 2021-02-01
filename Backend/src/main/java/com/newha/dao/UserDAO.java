package com.newha.dao;

import java.util.ArrayList;
import java.util.List;
import com.newha.vo.User;

public interface UserDAO {

	public ArrayList<User> selectAll();
	public ArrayList<Integer> follow(int userNo);
	
	public int insert(User u);
	public void delete(String id);
	public void update(User u);
	
	public User selectUser(int userNo);
	public User selectOne(User u);
	public User selectOneById(String id);
	public List<User> selectAllByKeyword(String keyword);
	public int selectId(String id);
	public int userNo(String id);

}
