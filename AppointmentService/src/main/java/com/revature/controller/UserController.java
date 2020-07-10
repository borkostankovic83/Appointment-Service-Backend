package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@CrossOrigin
	@PostMapping("/register")
	public User register(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			User userObject = userService.getUserByEmail(tempEmail);
			if(userObject != null) {
				throw new Exception("User with email " + tempEmail + " is already exist!");
			}
		}
		User userObject = null;
		userObject = userService.createUser(user);
		return userObject;
	}
	
	@CrossOrigin
	@GetMapping
	public List<User> users(){
		return userService.getUsers();
		
	}
	
	
}
