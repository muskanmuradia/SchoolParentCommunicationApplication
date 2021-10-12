package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Subject;
import com.cg.spc.service.IDiaryNotesService;

@RestController
@RequestMapping("api/diarynotes")
public class DiaryNotesController {
	@Autowired
	private IDiaryNotesService diaryNotesService;
	
	public DiaryNotesController(IDiaryNotesService diaryNotesService) {
		super();
		this.diaryNotesService = diaryNotesService;
	}

	@PostMapping("/adddiarynotes")
	public DiaryNotes addDiaryNotes(@RequestBody DiaryNotes dn) {
		return diaryNotesService.addDiaryNotes(dn);
	}
	
	@PostMapping("/updatediarynotes")
	public DiaryNotes updateDiaryNotes(@RequestBody DiaryNotes dn) {
		return diaryNotesService.updateDiaryNotes(dn);
	}
	
	@PostMapping("/deletediarynotes")
	public DiaryNotes deleteDiaryNotes(@RequestBody DiaryNotes dn) {
		return diaryNotesService.deleteDiaryNotes(dn);
	}
	
	@GetMapping("/retrievealldiarynotesbydate")
	public List<DiaryNotes> retrieveAllDiaryNotes(@RequestBody LocalDate ld){
		return diaryNotesService.retrieveAllDiaryNotes(ld);
	}
	
	@GetMapping("/retrievealldiarynotesbysubject")
	public List<DiaryNotes> retrieveAllDiaryNotes(@RequestBody Subject s){
		return diaryNotesService.retrieveAllDiaryNotes(s);
	}

}
