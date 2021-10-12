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
import com.cg.spc.entities.StudentExamAttempt;
import com.cg.spc.service.IStudentExamAttemptService;

@RestController
@RequestMapping("api/studentexamattempt")
public class StudentExamAttemptController {
	@Autowired
	private IStudentExamAttemptService studentExamAttemptService;
	
	public StudentExamAttemptController(IStudentExamAttemptService studentExamAttemptService) {
		super();
		this.studentExamAttemptService = studentExamAttemptService;
	}

	@PostMapping("/addStudentExamAttempt")
	public StudentExamAttempt addStudentExamAttempt(@RequestBody StudentExamAttempt sea) {
		return studentExamAttemptService.addStudentExamAttempt(sea);
	}
	
	@PostMapping("/updateStudentExamAttempt")
	public StudentExamAttempt updateStudentExamAttempt(@RequestBody StudentExamAttempt sea) {
		return studentExamAttemptService.updateStudentExamAttempt(sea);
	}
	
	@PostMapping("/deleteStudentExamAttempt")
	public StudentExamAttempt deleteStudentExamAttempt(@RequestBody StudentExamAttempt sea) {
		return studentExamAttemptService.deleteStudentExamAttempt(sea);
	}
	
	@GetMapping("/retrieveAllStudentExamAttemptByStudent")
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(@RequestBody Student s){
		return studentExamAttemptService.retrieveAllStudentExamAttemptByStudent(s);
	}
	
	@GetMapping("/retrieveStudentExamAttemptById/{i}")
	public StudentExamAttempt retrieveStudentExamAttemptById(@PathVariable int i) {
		return studentExamAttemptService.retrieveStudentExamAttemptById(i);
	}

}
