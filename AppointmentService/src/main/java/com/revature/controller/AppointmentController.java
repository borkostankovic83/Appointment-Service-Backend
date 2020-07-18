package com.revature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	/** GET request to return all appointments **/
	@GetMapping("/appointments")
	@CrossOrigin
	public List<Appointment> allAppointments() {
		return appointmentService.getAppointments();	
	}
	
	/** GET request to return specific appointments **/
	@GetMapping("/appointments/{id}")
	@CrossOrigin
	public Optional<Appointment> findById(@PathVariable Long id) {
		return appointmentService.findById(id);	
	}
	
	/** GET request to return all appointments based on a date range **/
//	@GetMapping("/appointments/")
//	@CrossOrigin
//    public List<Appointment> findByDateRange(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("startDate") LocalDate startDate, 
//    		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("endDate") LocalDate endDate) {
//        return appointmentService.findByDateRange(startDate, endDate);
//    }
	
	/** POST request to add new appointments **/
	@PostMapping("/appointments")
	@CrossOrigin
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
	}
	
	  /** PUT request to update appointments **/
    @PutMapping("/{id}")
    @CrossOrigin
	public Appointment update(@PathVariable Long id, @RequestBody Appointment appointment) {
        return appointmentService.update(id, appointment);
    }

    /** PATCH request to update status of an appointment **/
    @PatchMapping("/{id}")
    @CrossOrigin
    public Appointment updateStatus(@PathVariable Long id, @RequestBody Appointment appointment) {
        return appointmentService.updateStatus(id, appointment);
    }
	
	/** DELETE request to delete specific appointments **/
	@DeleteMapping("/appointments/{id}")
	@CrossOrigin
	public void deleteAppointment(@RequestParam Long id) {
		appointmentService.deleteAppointment(id);
	}

}
