package com.revature.repositiry;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

//	List<Appointment> findByDateRange(LocalDate startDate, LocalDate endDate);

}
