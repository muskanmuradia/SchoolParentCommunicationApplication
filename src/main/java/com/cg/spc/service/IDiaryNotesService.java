package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Subject;

public interface IDiaryNotesService {
	public DiaryNotes addDiaryNotes(DiaryNotes dn);
	public DiaryNotes updateDiaryNotes(DiaryNotes dn);
	public DiaryNotes deleteDiaryNotes(DiaryNotes dn);
	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate ld);
	public List<DiaryNotes> retrieveAllDiaryNotes(Subject s);

}
