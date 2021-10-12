package com.cg.spc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

@Service
public class IFeeInstallmentServiceImplementation implements IFeeInstallmentService {

	@Override
	public FeeInstallment makePayment(FeeInstallment fi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeeInstallment> pendingInstallments(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeeInstallment retrieveFeeInstallmentById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee f) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
