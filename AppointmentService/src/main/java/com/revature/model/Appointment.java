package com.revature.model;

import java.sql.Time;

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
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
//	private Time startTime;
//	private Time endTime;
	
	@Column(name = "user_id")
	private String userId;
	
//	@Column(name = "pet_id")
//	private String petId;
	
//	@Column(name = "vet_id")
//	private String vetId;
	
	private Time appointmentDate;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonIgnoreProperties({"pet", "appointment", "vet"})
    private User user;

	public Appointment() {
	}

	public Appointment(Long id, String userId, Time appointmentDate, User user) {
		this.id = id;
		this.userId = userId;
		this.appointmentDate = appointmentDate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Time getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Time appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", userId=" + userId + ", appointmentDate=" + appointmentDate + ", user="
				+ user + "]";
	}
	
//	@ManyToOne(cascade = CascadeType.REFRESH)
//	@JoinColumn(name="user_id", insertable = false, updatable = false)
//	@JsonIgnoreProperties({"user", "appointment", "vet"})
//    private Pet pet;
	
	

}
