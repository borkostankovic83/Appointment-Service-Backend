package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Appointment;
import com.revature.repositiry.AppointmentRepository;

@Service
public class AppointmentService {

	private AppointmentRepository appointmentRepository;

	@Autowired
	public AppointmentService(AppointmentRepository appointmentRepository) {
		this.appointmentRepository = appointmentRepository;
	}

	public List<Appointment> getAppointments() {
		return appointmentRepository.findAll();
	}

	public Appointment createAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	public void deleteAppointment(Long id) {
		appointmentRepository.deleteById(id);
	}
	
	
}
