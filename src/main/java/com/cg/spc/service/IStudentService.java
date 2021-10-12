package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Student;

public interface IStudentService {
	public Student addStudent(Student s);
	public Student updateStudent(Student s);
	public Student deleteStudent(Student s);
	public List<Student> retrieveAllStudents();
	public Student retrieveStudentById(int i);

}
