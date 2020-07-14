package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.repositiry.UserRepository;

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

	public User findById(Long id) {
		return userRepository.getOne(id);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getVetsUsers() {
		return userRepository.getAllVets();
	}

	public List<User> getCustomersUsers() {
		return userRepository.getCustomers();
	}

	public List<User> getAdminsUsers() {
		return userRepository.getAdmins();
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
