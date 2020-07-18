package com.revature.model;

import java.sql.Time;
import java.time.LocalDate;

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
	
    private LocalDate appointmentDate;
    private Time appointmentStartTime;
    private Time appointmentEndTime;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "pet_id")
	private String petId;
	
	private AppointmentStatus status = AppointmentStatus.Booked;
		
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonIgnoreProperties({"pet", "appointment", "user"})
    private User user;

	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="pet_id", insertable = false, updatable = false)
	@JsonIgnoreProperties({"user", "appointment", "pet"})
    private Pet pet;
	
	public Appointment() {
	}

	public Appointment(Long id, LocalDate appointmentDate, Time appointmentStartTime, Time appointmentEndTime,
			String userId, String petId, AppointmentStatus status, User user, Pet pet) {
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.userId = userId;
		this.petId = petId;
		this.status = status;
		this.user = user;
		this.pet = pet;
	}

	public Appointment(Long id, LocalDate appointmentDate, Time appointmentStartTime, Time appointmentEndTime,
			String userId, String petId, User user, Pet pet) {
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.userId = userId;
		this.petId = petId;
		this.user = user;
		this.pet = pet;
	}

	public Appointment(LocalDate appointmentDate, String userId, String petId, User user, Pet pet) {
		this.appointmentDate = appointmentDate;
		this.userId = userId;
		this.petId = petId;
		this.user = user;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Time getAppointmentStartTime() {
		return appointmentStartTime;
	}

	public void setAppointmentStartTime(Time appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public Time getAppointmentEndTime() {
		return appointmentEndTime;
	}

	public void setAppointmentEndTime(Time appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public AppointmentStatus getStatus() {
		return status;
	}

	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", appointmentStartTime="
				+ appointmentStartTime + ", appointmentEndTime=" + appointmentEndTime + ", userId=" + userId
				+ ", petId=" + petId + ", status=" + status + ", user=" + user + ", pet=" + pet + "]";
	}

	
}
