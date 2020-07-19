package com.revature.service;

import java.util.List;
import java.util.Optional;

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

	public Optional<Appointment> findById(Long id) {
		return appointmentRepository.findById(id);
	}

//	public List<Appointment> findByDateRange(LocalDate startDate, LocalDate endDate) {
//		return appointmentRepository.findByDateRange(startDate, endDate);
//	}

	public Appointment update(Long id, Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	public Appointment updateStatus(Long id, Appointment appointment) {
		Optional<Appointment> appointmentList = appointmentRepository.findById(id);

        if(appointmentList.isPresent()){
            if(appointment.getStatus() != null){
                appointmentList.get().setStatus(appointment.getStatus());
            }
            return appointmentRepository.save(appointmentList.get());
        }
        return null;	}
	
	
}
