package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.AppointmentSettings;

public interface AppointmentSettingsRepository extends JpaRepository<AppointmentSettings, Long> {

}
