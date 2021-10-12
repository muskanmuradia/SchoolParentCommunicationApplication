package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;

@Service
public class IAttendanceServiceImplementation implements IAttendanceService{

	@Override
	public Attendance addAttendance(Attendance a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attendance updateAttendance(Attendance a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> listAttendanceByMonth(LocalDate ld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> listAttendanceByStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
