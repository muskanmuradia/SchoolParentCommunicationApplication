package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.spc.entities.FeeInstallment;

public interface IFeeInstallmentRepository extends JpaRepository<FeeInstallment, Integer> {
	
}
