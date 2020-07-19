package com.revature.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	// Don't need @Autowired anymore
	public UserController(UserService userService) {
		this.userService = userService;
	}

	//Register user save user to database with roll User
	@CrossOrigin
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {
		return userService.createUser(user);
	}
	
	//Register user save user to database with roll Vet
	@CrossOrigin
	@PostMapping("/vet")
	public User registerVet(@RequestBody User user) throws Exception  {		
		return userService.createVet(user);
	}
	
	//Get back all users from database
	@CrossOrigin
	@GetMapping
	public List<User> users(){
		return userService.getUsers();
		
	}
	
	//Get back all with role 'Vet' users from database
	@CrossOrigin
	@GetMapping("/vets")
	public List<User> vets(){
		return userService.getVetsUsers();
		
	}	
	
	//Get back all with role 'User' users from database
	@CrossOrigin
	@GetMapping("/customers")
	public List<User> customers(){
		return userService.getCustomersUsers();
		
	}	
	
	//Get back all with role 'User' users from database
	@CrossOrigin
	@GetMapping("/admins")
	public List<User> admins(){
		return userService.getAdminsUsers();
		
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
	
	//delete user
	@CrossOrigin
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
}