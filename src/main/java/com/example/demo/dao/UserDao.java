package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;

@Repository
public class UserDao {

	@Autowired
	UserMapper userMapper;
	
	public List<User> getUserList() {
		List<User> userList = userMapper.getUserList();
		return userList;
	}
	
	public User getUserById(int id) {
		User user = userMapper.getUserById(id);
		return user;
	}
	
	public int insertUser(User user) {
		int insertedId = userMapper.insertUser(user);
		return insertedId;
	}
	
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
	
	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

}
