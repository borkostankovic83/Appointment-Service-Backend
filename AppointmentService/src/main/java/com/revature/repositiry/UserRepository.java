package com.revature.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmailAndPassword(String email, String password);

	public User findByEmail(String tempEmail);

	@Query("FROM User WHERE role='Vet'")
	public List<User> getAllVets();

	@Query("FROM User WHERE role='User'")
	public List<User> getCustomers();

	@Query("FROM User WHERE role='Admin'")
	public List<User> getAdmins();

}
