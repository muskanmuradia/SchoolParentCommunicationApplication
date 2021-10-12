package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IAttendanceService;

@RestController
@RequestMapping("api/attendance")
public class AttendanceController {
	@Autowired
	private IAttendanceService attendanceService;
	
	public AttendanceController(IAttendanceService attendanceService) {
		super();
		this.attendanceService = attendanceService;
	}

	@PostMapping("/addattendance")
	public Attendance addAttendance(@RequestBody Attendance a) {
		return attendanceService.addAttendance(a);
	}
	
	@PostMapping("/updateattendance")
	public Attendance updateAttendance(@RequestBody Attendance a) {
		return attendanceService.updateAttendance(a);
	}
	
	@GetMapping("/attendancebymonth")
	public List<Attendance> listAttendanceByMonth(@RequestBody LocalDate ld){
		return attendanceService.listAttendanceByMonth(ld);
	}
	
	@GetMapping("/attendancebystudent")
	public List<Attendance> listAttendanceByStudent(@RequestBody Student s){
		return attendanceService.listAttendanceByStudent(s);
	}

}
