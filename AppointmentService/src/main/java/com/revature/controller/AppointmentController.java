package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Appointment;
import com.revature.service.AppointmentService;

@RestController
public class AppointmentController {
	
	private AppointmentService appointmentService;

	@Autowired
	public AppointmentController(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}
	
	@GetMapping("/appointments")
	@CrossOrigin
	private List<Appointment> allAppointments() {
		return appointmentService.getAppointments();
		
	}
	
	@PostMapping("/appointments")
	@CrossOrigin
	private Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
	}
	
	@DeleteMapping("/appointments/{id}")
	@CrossOrigin
	private void deleteAppointment(@RequestParam Long id) {
		appointmentService.deleteAppointment(id);
	}

}
