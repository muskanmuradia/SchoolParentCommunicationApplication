package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;

public interface IStudentExamAttemptService {
	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt sea);
	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt sea);
	public StudentExamAttempt deleteStudentExamAttempt(StudentExamAttempt sea);
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(Student s);
	public StudentExamAttempt retrieveStudentExamAttemptById(int i);

}
