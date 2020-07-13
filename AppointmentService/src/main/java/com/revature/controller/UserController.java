package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	//Register user save user to database
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
	
	//Get back all users from db
	@CrossOrigin
	@GetMapping
	public List<User> users(){
		return userService.getUsers();
		
	}
	
	//Get user by email address, so send email receive user object
	@CrossOrigin
	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable(value = "email") String email) {
		User user = userService.getUserByEmail(email);	
		return user;
	}
	
	//update user data
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
		User user = userService.findById(id);
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		final User updatedUser = userService.updateUser(user);
		return ResponseEntity.ok(updatedUser);
	}
	
}