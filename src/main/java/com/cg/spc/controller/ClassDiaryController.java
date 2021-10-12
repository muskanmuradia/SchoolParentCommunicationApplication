package com.cg.spc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassDiary;
import com.cg.spc.service.IClassDiaryService;

@RestController
@RequestMapping("api/classdiary")
public class ClassDiaryController {
	@Autowired
	private IClassDiaryService classDiaryService;
	
	public ClassDiaryController(IClassDiaryService classDiaryService) {
		super();
		this.classDiaryService = classDiaryService;
	}

	@PostMapping("/addclassdiary")
	public ClassDiary addClassDiary(@RequestBody ClassDiary cd) {
		return classDiaryService.addClassDiary(cd);
	}
	
	@PostMapping("/retrieveclassdiary")
	public ClassDiary retrieveClassDiary(@RequestBody ClassDiary cd) {
		return classDiaryService.retrieveClassDiary(cd);
	}

}
