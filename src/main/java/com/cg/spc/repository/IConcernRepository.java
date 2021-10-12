package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.Concern;

public interface IConcernRepository extends JpaRepository<Concern, Integer> {

}
