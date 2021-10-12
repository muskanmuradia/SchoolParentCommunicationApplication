package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IParentService;

@RestController
@RequestMapping("api/parent")
public class ParentController {
	@Autowired
	private IParentService parentService;
	
	public ParentController(IParentService parentService) {
		super();
		this.parentService = parentService;
	}

	@PostMapping("/addparent")
	public Parent addParent(Parent p) {
		return parentService.addParent(p);
	}
	
	@PostMapping("/updateparent")
	public Parent updateParent(Parent p) {
		return parentService.updateParent(p);
	}
	
	@GetMapping("/retrieveparentlistbyclass")
	public List<Parent> retrieveParentListByClass(ClassId cid){
		return parentService.retrieveParentListByClass(cid);
	}
	
	@PostMapping("/retrieveparentbystudent")
	public Parent retrieveParentByStudent(Student s) {
		return parentService.retrieveParentByStudent(s);
	}
	
	@GetMapping("/retrieveparentbyid/{i}")
	public Parent retrieveParentById(int i) {
		return parentService.retrieveParentById(i);
	}

}
