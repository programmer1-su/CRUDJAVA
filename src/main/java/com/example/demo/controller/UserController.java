package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public @ResponseBody List<User> getUserList() {

		List<User> userList = userService.getUserList();
		return userList;

	}
	
	@RequestMapping(value = "/getUserById", method= RequestMethod.GET)
	public @ResponseBody User getUserById(@RequestParam(value = "id") int id) {
		User user = userService.getUserById(id);
		return user;
	}
	
	@RequestMapping(value= "/insertUser", method = RequestMethod.POST)
	public @ResponseBody int insertUser(@RequestBody User user) {
		int insertedId = userService.insertUser(user);
		return insertedId;
	}
	
	@RequestMapping(value= "/updateUser", method = RequestMethod.PUT)
	public @ResponseBody void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value= "/deleteUser", method = RequestMethod.DELETE)
	public @ResponseBody void deleteUser(@RequestParam(value="id") int id) {
		userService.deleteUser(id);
	}
	
}
