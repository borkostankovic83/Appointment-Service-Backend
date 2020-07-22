package com.revature.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode @ToString
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
	@JsonIgnoreProperties({"user", "images", "hibernateLazyInitializer"})
	private ProfilePicture image;
	
	
}
