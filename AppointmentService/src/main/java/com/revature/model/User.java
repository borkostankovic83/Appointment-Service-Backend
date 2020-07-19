package com.revature.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String role;
	
	@CreatedDate
	private Date registrationDate;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"user", "image"})
	private Set<Pet> pet;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"user", "image"})
	private Set<Appointment> appointment;
	
	@OneToOne(mappedBy = "user")
	@JsonIgnoreProperties({"user", "image"})
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private ProfilePicture image;
	
	public User() {

	}
		
	public User(Long id, String firstName, String lastName, String email, String password, String role,
			Date registrationDate, Set<Pet> pet, Set<Appointment> appointment, ProfilePicture image) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.registrationDate = registrationDate;
		this.pet = pet;
		this.appointment = appointment;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Set<Pet> getPet() {
		return pet;
	}

	public void setPet(Set<Pet> pet) {
		this.pet = pet;
	}

	public Set<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}

	public ProfilePicture getImage() {
		return image;
	}

	public void setImage(ProfilePicture image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", registrationDate=" + registrationDate + ", pet="
				+ pet + ", appointment=" + appointment + ", image=" + image + "]";
	}

}
