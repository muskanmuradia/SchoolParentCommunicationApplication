package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.spc.entities.Parent;

public interface IParentRepository extends JpaRepository<Parent, Integer> {
	

}
