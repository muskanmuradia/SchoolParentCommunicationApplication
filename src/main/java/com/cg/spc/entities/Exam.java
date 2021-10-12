package com.cg.spc.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="EXAM_1")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXAM_ID")
	private int examId;
	
	@Column(name = "DATE_TIME_OF_EXAM")
	private LocalDateTime dateTimeofExam;
	
	@Column(name = "MAX_MARKS")
	private int maxMarks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUBJECT")
	private Subject subject;
	
	@Enumerated(value=EnumType.STRING)
	@Column(name="EXAM_TYPE")
	private ExamType examType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLASS_ID")
	private ClassId classId;
	
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public LocalDateTime getDateTimeofExam() {
		return dateTimeofExam;
	}
	public void setDateTimeofExam(LocalDateTime dateTimeofExam) {
		this.dateTimeofExam = dateTimeofExam;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public Exam(int examId, LocalDateTime dateTimeofExam, int maxMarks) {
		super();
		this.examId = examId;
		this.dateTimeofExam = dateTimeofExam;
		this.maxMarks = maxMarks;
	}
	public Exam() {
		super();
	}
	
	

}
