package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Student;
import com.cg.spc.service.IStudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	public StudentController(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student s) {
		return studentService.addStudent(s);
	}
	
	@PostMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student s) {
		return studentService.updateStudent(s);
	}
	
	@PostMapping("/deletestudent")
	public Student deleteStudent(@RequestBody Student s) {
		return studentService.deleteStudent(s);
	}
	
	@GetMapping("/retrieveallstudents")
	public List<Student> retrieveAllStudents(){
		return studentService.retrieveAllStudents();
	}
	
	@GetMapping("/retrievestudentbyid/{i}")
	public Student retrieveStudentById(@PathVariable int i) {
		return studentService.retrieveStudentById(i);
	}

}
