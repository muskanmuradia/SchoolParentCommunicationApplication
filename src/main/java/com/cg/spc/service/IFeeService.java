package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;

public interface IFeeService {
	public Fee addFee(Fee f);
	public Fee deleteFee(int i);
	public Fee updateFee(Fee f);
	public Fee retrieveFee(int i);
	public Fee retrieveFeeByStudent(Student s);
	public List<Fee> retrieveAllFeeByMonth(int i);

}
