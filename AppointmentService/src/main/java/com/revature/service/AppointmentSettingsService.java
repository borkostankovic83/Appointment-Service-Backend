package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.model.AppointmentSettings;
import com.revature.repository.AppointmentSettingsRepository;

@Service
public class AppointmentSettingsService {
	private AppointmentSettingsRepository appointmentSettingsRepository;
	
	public void saveAppointmnentSettings(AppointmentSettings settings) {
		appointmentSettingsRepository.save(settings);
	}

}
