package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;

public interface IAttendanceService {
	public Attendance addAttendance(Attendance a);
	public Attendance updateAttendance(Attendance a);
	public List<Attendance> listAttendanceByMonth(LocalDate ld);
	public List<Attendance> listAttendanceByStudent(Student s);
	
	
}
