package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Appointment_Settings")
public class AppointmentSettings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@Column(name="max_number_of_days_ahead", length=3)
	@Size(max=3,message="The maximum nuber of days ahead an appointment can be made is a 3 digits number.")
	private int appointment_maxDaysAhead_user_value;
	
	@Column(name="appointment_duration_user_value", length=2)
	@Size(max=2,message="The duration of an appointment is a 2 digit number.")
	private int appointment_duration_user_value;
	
	@Column(name="monday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Monday morning ")
	private String monday_morning_schedule_begin;
	
	@Column(name="monday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Monday morning ")
	private String monday_morning_schedule_end;
	
	@Column(name="monday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Monday afternoon ")
	private String monday_afternoon_schedule_begin;
	
	@Column(name="monday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Monday afternoon ")
	private String monday_afternoon_schedule_end;
	//
	@Column(name="tuesday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Tuesday morning ")
	private String tuesday_morning_schedule_begin;
	
	@Column(name="tuesday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Tuesday morning ")
	private String tuesday_morning_schedule_end;
	
	@Column(name="tuesday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Tuesday afternoon ")
	private String tuesday_afternoon_schedule_begin;
	
	@Column(name="tuesday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Tuesday afternoon ")
	private String tuesday_afternoon_schedule_end;
	//
	@Column(name="wednesday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Wednesday morning ")
	private String wednesday_morning_schedule_begin;
	
	@Column(name="wednesday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Wednesday morning ")
	private String wednesday_morning_schedule_end;
	
	@Column(name="wednesday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Wednesday afternoon ")
	private String wednesday_afternoon_schedule_begin;
	
	@Column(name="wednesday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Wednesday afternoon ")
	private String wednesday_afternoon_schedule_end;
	//
	@Column(name="thursday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Thursday morning ")
	private String thursday_morning_schedule_begin;
	
	@Column(name="thursday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Thursday morning ")
	private String thursday_morning_schedule_end;
	
	@Column(name="thursday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Thursday afternoon ")
	private String thursday_afternoon_schedule_begin;
	
	@Column(name="thursday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Thursday afternoon ")
	private String thursday_afternoon_schedule_end;
	//
	@Column(name="friday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Friday morning ")
	private String friday_morning_schedule_begin;
	
	@Column(name="friday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Friday morning ")
	private String friday_morning_schedule_end;
	
	@Column(name="friday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Friday afternoon ")
	private String friday_afternoon_schedule_begin;
	
	@Column(name="friday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Friday afternoon ")
	private String friday_afternoon_schedule_end;
	//
	@Column(name="saturday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Saturday morning ")
	private String saturday_morning_schedule_begin;
	
	@Column(name="saturday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Saturday morning ")
	private String saturday_morning_schedule_end;
	
	@Column(name="saturday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Saturday afternoon ")
	private String saturday_afternoon_schedule_begin;
	
	@Column(name="saturday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Saturday afternoon ")
	private String saturday_afternoon_schedule_end;
	//
	@Column(name="sunday_morning_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Sunday morning ")
	private String sunday_morning_schedule_begin;
	
	@Column(name="sunday_morning_schedule_end")
	@Size(max=5, message="The schedule time at the end of Sunday morning ")
	private String sunday_morning_schedule_end;
	
	@Column(name="sunday_afternoon_schedule_begin")
	@Size(max=5, message="The schedule time at the beginning of Sunday afternoon ")
	private String sunday_afternoon_schedule_begin;
	
	@Column(name="sunday_afternoon_schedule_end")
	@Size(max=5, message="The schedule time at the end of Sunday afternoon ")
	private String sunday_afternoon_schedule_end;
	
	public AppointmentSettings() {}

	public AppointmentSettings(
			@Size(max = 3, message = "The maximum nuber of days ahead an appointment can be made is a 3 digits number.") int appointment_maxDaysAhead_user_value,
			@Size(max = 2, message = "The duration of an appointment is a 2 digit number.") int appointment_duration_user_value,
			@Size(max = 5, message = "The schedule time at the beginning of Monday morning ") String monday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Monday morning ") String monday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Monday afternoon ") String monday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Monday afternoon ") String monday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Tuesday morning ") String tuesday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Tuesday morning ") String tuesday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Tuesday afternoon ") String tuesday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Tuesday afternoon ") String tuesday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Wednesday morning ") String wednesday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Wednesday morning ") String wednesday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Wednesday afternoon ") String wednesday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Wednesday afternoon ") String wednesday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Thursday morning ") String thursday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Thursday morning ") String thursday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Thursday afternoon ") String thursday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Thursday afternoon ") String thursday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Friday morning ") String friday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Friday morning ") String friday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Friday afternoon ") String friday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Friday afternoon ") String friday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Saturday morning ") String saturday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Saturday morning ") String saturday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Saturday afternoon ") String saturday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Saturday afternoon ") String saturday_afternoon_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Sunday morning ") String sunday_morning_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Sunday morning ") String sunday_morning_schedule_end,
			@Size(max = 5, message = "The schedule time at the beginning of Sunday afternoon ") String sunday_afternoon_schedule_begin,
			@Size(max = 5, message = "The schedule time at the end of Sunday afternoon ") String sunday_afternoon_schedule_end) {
		super();
		this.appointment_maxDaysAhead_user_value = appointment_maxDaysAhead_user_value;
		this.appointment_duration_user_value = appointment_duration_user_value;
		this.monday_morning_schedule_begin = monday_morning_schedule_begin;
		this.monday_morning_schedule_end = monday_morning_schedule_end;
		this.monday_afternoon_schedule_begin = monday_afternoon_schedule_begin;
		this.monday_afternoon_schedule_end = monday_afternoon_schedule_end;
		this.tuesday_morning_schedule_begin = tuesday_morning_schedule_begin;
		this.tuesday_morning_schedule_end = tuesday_morning_schedule_end;
		this.tuesday_afternoon_schedule_begin = tuesday_afternoon_schedule_begin;
		this.tuesday_afternoon_schedule_end = tuesday_afternoon_schedule_end;
		this.wednesday_morning_schedule_begin = wednesday_morning_schedule_begin;
		this.wednesday_morning_schedule_end = wednesday_morning_schedule_end;
		this.wednesday_afternoon_schedule_begin = wednesday_afternoon_schedule_begin;
		this.wednesday_afternoon_schedule_end = wednesday_afternoon_schedule_end;
		this.thursday_morning_schedule_begin = thursday_morning_schedule_begin;
		this.thursday_morning_schedule_end = thursday_morning_schedule_end;
		this.thursday_afternoon_schedule_begin = thursday_afternoon_schedule_begin;
		this.thursday_afternoon_schedule_end = thursday_afternoon_schedule_end;
		this.friday_morning_schedule_begin = friday_morning_schedule_begin;
		this.friday_morning_schedule_end = friday_morning_schedule_end;
		this.friday_afternoon_schedule_begin = friday_afternoon_schedule_begin;
		this.friday_afternoon_schedule_end = friday_afternoon_schedule_end;
		this.saturday_morning_schedule_begin = saturday_morning_schedule_begin;
		this.saturday_morning_schedule_end = saturday_morning_schedule_end;
		this.saturday_afternoon_schedule_begin = saturday_afternoon_schedule_begin;
		this.saturday_afternoon_schedule_end = saturday_afternoon_schedule_end;
		this.sunday_morning_schedule_begin = sunday_morning_schedule_begin;
		this.sunday_morning_schedule_end = sunday_morning_schedule_end;
		this.sunday_afternoon_schedule_begin = sunday_afternoon_schedule_begin;
		this.sunday_afternoon_schedule_end = sunday_afternoon_schedule_end;
	}

	public int getAppointment_maxDaysAhead_user_value() {
		return appointment_maxDaysAhead_user_value;
	}

	public void setAppointment_maxDaysAhead_user_value(int appointment_maxDaysAhead_user_value) {
		this.appointment_maxDaysAhead_user_value = appointment_maxDaysAhead_user_value;
	}

	public int getAppointment_duration_user_value() {
		return appointment_duration_user_value;
	}

	public void setAppointment_duration_user_value(int appointment_duration_user_value) {
		this.appointment_duration_user_value = appointment_duration_user_value;
	}

	public String getMonday_morning_schedule_begin() {
		return monday_morning_schedule_begin;
	}

	public void setMonday_morning_schedule_begin(String monday_morning_schedule_begin) {
		this.monday_morning_schedule_begin = monday_morning_schedule_begin;
	}

	public String getMonday_morning_schedule_end() {
		return monday_morning_schedule_end;
	}

	public void setMonday_morning_schedule_end(String monday_morning_schedule_end) {
		this.monday_morning_schedule_end = monday_morning_schedule_end;
	}

	public String getMonday_afternoon_schedule_begin() {
		return monday_afternoon_schedule_begin;
	}

	public void setMonday_afternoon_schedule_begin(String monday_afternoon_schedule_begin) {
		this.monday_afternoon_schedule_begin = monday_afternoon_schedule_begin;
	}

	public String getMonday_afternoon_schedule_end() {
		return monday_afternoon_schedule_end;
	}

	public void setMonday_afternoon_schedule_end(String monday_afternoon_schedule_end) {
		this.monday_afternoon_schedule_end = monday_afternoon_schedule_end;
	}

	public String getTuesday_morning_schedule_begin() {
		return tuesday_morning_schedule_begin;
	}

	public void setTuesday_morning_schedule_begin(String tuesday_morning_schedule_begin) {
		this.tuesday_morning_schedule_begin = tuesday_morning_schedule_begin;
	}

	public String getTuesday_morning_schedule_end() {
		return tuesday_morning_schedule_end;
	}

	public void setTuesday_morning_schedule_end(String tuesday_morning_schedule_end) {
		this.tuesday_morning_schedule_end = tuesday_morning_schedule_end;
	}

	public String getTuesday_afternoon_schedule_begin() {
		return tuesday_afternoon_schedule_begin;
	}

	public void setTuesday_afternoon_schedule_begin(String tuesday_afternoon_schedule_begin) {
		this.tuesday_afternoon_schedule_begin = tuesday_afternoon_schedule_begin;
	}

	public String getTuesday_afternoon_schedule_end() {
		return tuesday_afternoon_schedule_end;
	}

	public void setTuesday_afternoon_schedule_end(String tuesday_afternoon_schedule_end) {
		this.tuesday_afternoon_schedule_end = tuesday_afternoon_schedule_end;
	}

	public String getWednesday_morning_schedule_begin() {
		return wednesday_morning_schedule_begin;
	}

	public void setWednesday_morning_schedule_begin(String wednesday_morning_schedule_begin) {
		this.wednesday_morning_schedule_begin = wednesday_morning_schedule_begin;
	}

	public String getWednesday_morning_schedule_end() {
		return wednesday_morning_schedule_end;
	}

	public void setWednesday_morning_schedule_end(String wednesday_morning_schedule_end) {
		this.wednesday_morning_schedule_end = wednesday_morning_schedule_end;
	}

	public String getWednesday_afternoon_schedule_begin() {
		return wednesday_afternoon_schedule_begin;
	}

	public void setWednesday_afternoon_schedule_begin(String wednesday_afternoon_schedule_begin) {
		this.wednesday_afternoon_schedule_begin = wednesday_afternoon_schedule_begin;
	}

	public String getWednesday_afternoon_schedule_end() {
		return wednesday_afternoon_schedule_end;
	}

	public void setWednesday_afternoon_schedule_end(String wednesday_afternoon_schedule_end) {
		this.wednesday_afternoon_schedule_end = wednesday_afternoon_schedule_end;
	}

	public String getThursday_morning_schedule_begin() {
		return thursday_morning_schedule_begin;
	}

	public void setThursday_morning_schedule_begin(String thursday_morning_schedule_begin) {
		this.thursday_morning_schedule_begin = thursday_morning_schedule_begin;
	}

	public String getThursday_morning_schedule_end() {
		return thursday_morning_schedule_end;
	}

	public void setThursday_morning_schedule_end(String thursday_morning_schedule_end) {
		this.thursday_morning_schedule_end = thursday_morning_schedule_end;
	}

	public String getThursday_afternoon_schedule_begin() {
		return thursday_afternoon_schedule_begin;
	}

	public void setThursday_afternoon_schedule_begin(String thursday_afternoon_schedule_begin) {
		this.thursday_afternoon_schedule_begin = thursday_afternoon_schedule_begin;
	}

	public String getThursday_afternoon_schedule_end() {
		return thursday_afternoon_schedule_end;
	}

	public void setThursday_afternoon_schedule_end(String thursday_afternoon_schedule_end) {
		this.thursday_afternoon_schedule_end = thursday_afternoon_schedule_end;
	}

	public String getFriday_morning_schedule_begin() {
		return friday_morning_schedule_begin;
	}

	public void setFriday_morning_schedule_begin(String friday_morning_schedule_begin) {
		this.friday_morning_schedule_begin = friday_morning_schedule_begin;
	}

	public String getFriday_morning_schedule_end() {
		return friday_morning_schedule_end;
	}

	public void setFriday_morning_schedule_end(String friday_morning_schedule_end) {
		this.friday_morning_schedule_end = friday_morning_schedule_end;
	}

	public String getFriday_afternoon_schedule_begin() {
		return friday_afternoon_schedule_begin;
	}

	public void setFriday_afternoon_schedule_begin(String friday_afternoon_schedule_begin) {
		this.friday_afternoon_schedule_begin = friday_afternoon_schedule_begin;
	}

	public String getFriday_afternoon_schedule_end() {
		return friday_afternoon_schedule_end;
	}

	public void setFriday_afternoon_schedule_end(String friday_afternoon_schedule_end) {
		this.friday_afternoon_schedule_end = friday_afternoon_schedule_end;
	}

	public String getSaturday_morning_schedule_begin() {
		return saturday_morning_schedule_begin;
	}

	public void setSaturday_morning_schedule_begin(String saturday_morning_schedule_begin) {
		this.saturday_morning_schedule_begin = saturday_morning_schedule_begin;
	}

	public String getSaturday_morning_schedule_end() {
		return saturday_morning_schedule_end;
	}

	public void setSaturday_morning_schedule_end(String saturday_morning_schedule_end) {
		this.saturday_morning_schedule_end = saturday_morning_schedule_end;
	}

	public String getSaturday_afternoon_schedule_begin() {
		return saturday_afternoon_schedule_begin;
	}

	public void setSaturday_afternoon_schedule_begin(String saturday_afternoon_schedule_begin) {
		this.saturday_afternoon_schedule_begin = saturday_afternoon_schedule_begin;
	}

	public String getSaturday_afternoon_schedule_end() {
		return saturday_afternoon_schedule_end;
	}

	public void setSaturday_afternoon_schedule_end(String saturday_afternoon_schedule_end) {
		this.saturday_afternoon_schedule_end = saturday_afternoon_schedule_end;
	}

	public String getSunday_morning_schedule_begin() {
		return sunday_morning_schedule_begin;
	}

	public void setSunday_morning_schedule_begin(String sunday_morning_schedule_begin) {
		this.sunday_morning_schedule_begin = sunday_morning_schedule_begin;
	}

	public String getSunday_morning_schedule_end() {
		return sunday_morning_schedule_end;
	}

	public void setSunday_morning_schedule_end(String sunday_morning_schedule_end) {
		this.sunday_morning_schedule_end = sunday_morning_schedule_end;
	}

	public String getSunday_afternoon_schedule_begin() {
		return sunday_afternoon_schedule_begin;
	}

	public void setSunday_afternoon_schedule_begin(String sunday_afternoon_schedule_begin) {
		this.sunday_afternoon_schedule_begin = sunday_afternoon_schedule_begin;
	}

	public String getSunday_afternoon_schedule_end() {
		return sunday_afternoon_schedule_end;
	}

	public void setSunday_afternoon_schedule_end(String sunday_afternoon_schedule_end) {
		this.sunday_afternoon_schedule_end = sunday_afternoon_schedule_end;
	}
	
	
	
}
