package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.User;

public interface UserMapper {

	public List<User> getUserList();
	
	public User getUserById(int id);
	
	public int insertUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
}
