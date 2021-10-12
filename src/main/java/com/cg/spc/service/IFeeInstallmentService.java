package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

public interface IFeeInstallmentService {
	public FeeInstallment makePayment(FeeInstallment fi);
	public List<FeeInstallment> pendingInstallments(Student s);
	public FeeInstallment retrieveFeeInstallmentById(int i);
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee f);

}
