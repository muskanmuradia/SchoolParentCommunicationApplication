package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.spc.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
	

}
