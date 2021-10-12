package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IExamService;

@RestController
@RequestMapping("api/exam")
public class ExamController {
	@Autowired
	private IExamService examService;
	
	public ExamController(IExamService examService) {
		super();
		this.examService = examService;
	}

	@PostMapping("/addexam")
	public Exam addExam(@RequestBody Exam e) {
		return examService.addExam(e);
	}
	
	@DeleteMapping("/deleteexam/{i}")
	public Exam deleteExam(@PathVariable int i) {
		return examService.deleteExam(i);
	}
	
	@PostMapping("/updateexam")
	public Exam updateExam(@RequestBody Exam e) {
		return examService.updateExam(e);
	}
	
	@GetMapping("/listallexamsbydate")
	public List<Exam> listAllExamsByDate(@RequestBody LocalDate ld){
		return examService.listAllExamsByDate(ld);
	}
	
	@GetMapping("/listallexamsbyclass")
	public List<Exam> listAllExamsByClass(@RequestBody ClassId cid){
		return examService.listAllExamsByClass(cid);
	}
	
	@GetMapping("/listallexamsbystudent")
	public List<Exam> listAllExamsByStudent(@RequestBody Student s){
		return examService.listAllExamsByStudent(s);
	}
	
	@GetMapping("/listexambyid/{i}")
	public Exam listExamById(@PathVariable int i) {
		return examService.listExamById(i);
	}

}
