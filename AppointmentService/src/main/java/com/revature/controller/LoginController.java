package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.service.UserService;

@RestController
public class LoginController {
	
	private UserService userService;

	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	
	@CrossOrigin
	@PostMapping("/login")
	public User login(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		String tempPassword = user.getPassword();
		
		User userObj = null;
		if(tempEmail != null && tempPassword != null) {
			userObj = userService.getUserByEmailAndPasswod(tempEmail, tempPassword);
		}else {
			throw new Exception("Bad Credentials");
		}
		if(userObj == null){
			throw new Exception("Bad Credentials");
		}
		return userObj;
		
	}

}
