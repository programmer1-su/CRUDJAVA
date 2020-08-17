package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public List<User> getUserList() {
		List<User> userList = userDao.getUserList();
		return userList;
	}
	
	public User getUserById(int id) {
		User user = userDao.getUserById(id);
		return user;
	}
	
	public int insertUser(User user) {
		int insertedId = userDao.insertUser(user);
		return insertedId;
	}
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
}
