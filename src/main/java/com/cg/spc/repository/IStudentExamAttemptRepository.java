package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.spc.entities.StudentExamAttempt;

public interface IStudentExamAttemptRepository extends JpaRepository<StudentExamAttempt, Integer> {
	
}
