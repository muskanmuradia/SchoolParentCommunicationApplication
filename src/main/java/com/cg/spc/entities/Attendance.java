package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "ATTENDANCE")
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ATTENDANCE_ID")
	private int attendanceId;
	
	@Column(name = "DATE_OF_CLASS")
	private LocalDate dateOfClass;
	
	@Column(name = "PRESENT")
	private boolean present;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT")
	private Student student;
	
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public LocalDate getDateOfClass() {
		return dateOfClass;
	}
	public void setDateOfClass(LocalDate dateOfClass) {
		this.dateOfClass = dateOfClass;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public Attendance(int attendanceId, LocalDate dateOfClass, boolean present) {
		super();
		this.attendanceId = attendanceId;
		this.dateOfClass = dateOfClass;
		this.present = present;
	}
	public Attendance() {
		super();
	}
	
	

}
