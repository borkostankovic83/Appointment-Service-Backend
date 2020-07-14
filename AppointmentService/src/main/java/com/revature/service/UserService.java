package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User getUserByEmailAndPasswod(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public User getUserByEmail(String tempEmail) {
		return userRepository.findByEmail(tempEmail);
	}

}
