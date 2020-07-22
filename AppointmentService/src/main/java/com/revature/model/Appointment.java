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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode @ToString
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
	
}
