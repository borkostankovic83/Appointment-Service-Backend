package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.AppointmentSettings;
import com.revature.repository.AppointmentSettingsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentSettingsController {
	@Autowired 
	AppointmentSettingsRepository settingsRepository;
	
	@PostMapping("/settings")
	public AppointmentSettings addNewSettings(@RequestBody AppointmentSettings appointmentSettings) {
		return settingsRepository.save(appointmentSettings);
		
	}

}
