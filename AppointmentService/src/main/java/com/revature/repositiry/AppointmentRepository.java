package com.revature.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

//	List<Appointment> findByDateRange(startDate, endDate);

}
