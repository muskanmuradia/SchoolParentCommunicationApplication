package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;

public interface IExamService {
	public Exam addExam(Exam e);
	public Exam deleteExam(int i);
	public Exam updateExam(Exam e);
	public List<Exam> listAllExamsByDate(LocalDate ld);
	public List<Exam> listAllExamsByClass(ClassId cid);
	public List<Exam> listAllExamsByStudent(Student s);
	public Exam listExamById(int i);

}
