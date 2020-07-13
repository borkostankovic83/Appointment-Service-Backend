package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_id")
    private Long userId;
	
	private String petName;
	private String type;
	private String gender;
	private String age;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonIgnoreProperties("pet")
    private User user;
	
	public Pet() {
	}
	
	public Pet(Long id, Long userId, String petName, String type, String gender, String age, User user) {
		this.id = id;
		this.userId = userId;
		this.petName = petName;
		this.type = type;
		this.gender = gender;
		this.age = age;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", userId=" + userId + ", petName=" + petName + ", type=" + type + ", gender=" + gender
				+ ", age=" + age + ", user=" + user + "]";
	}
	
	
}
