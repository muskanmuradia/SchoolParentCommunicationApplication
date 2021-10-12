package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IFeeService;

@RestController
@RequestMapping("api/fee")
public class FeeController {
	@Autowired
	private IFeeService feeService;
	
	public FeeController(IFeeService feeService) {
		super();
		this.feeService = feeService;
	}

	@PostMapping("/addfee")
	public Fee addFee(@RequestBody Fee f) {
		return feeService.addFee(f);
	}
	
	@DeleteMapping("/deletefee/{i}")
	public Fee deleteFee(@PathVariable int i) {
		return feeService.deleteFee(i);
	}
	
	@PostMapping("/updatefee")
	public Fee updateFee(@RequestBody Fee f) {
		return feeService.updateFee(f);
	}
	
	@GetMapping("/retrievefee/{i}")
	public Fee retrieveFee(@PathVariable int i) {
		return feeService.retrieveFee(i);
	}
	
	@PostMapping("/retrievefeebystudent")
	public Fee retrieveFeeByStudent(@RequestBody Student s) {
		return feeService.retrieveFeeByStudent(s);
	}
	
	@GetMapping("/retrieveallfeebymonth/{i}")
	public List<Fee> retrieveAllFeeByMonth(@PathVariable int i){
		return feeService.retrieveAllFeeByMonth(i);
	}

}
