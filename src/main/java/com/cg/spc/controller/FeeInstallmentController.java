package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IFeeInstallmentService;

@RestController
@RequestMapping("api/feeinstallment")
public class FeeInstallmentController {
	@Autowired
	private IFeeInstallmentService feeInstallmentService;
	
	public FeeInstallmentController(IFeeInstallmentService feeInstallmentService) {
		super();
		this.feeInstallmentService = feeInstallmentService;
	}

	@PostMapping("/makepayment")
	public FeeInstallment makePayment(@RequestBody FeeInstallment fi) {
		return feeInstallmentService.makePayment(fi);
	}
	
	@GetMapping("/pendinginstallments")
	public List<FeeInstallment> pendingInstallments(@RequestBody Student s){
		return feeInstallmentService.pendingInstallments(s);
	}
	
	@GetMapping("/retrievefeeinstallmentbyid/{i}")
	public FeeInstallment retrieveFeeInstallmentById(@PathVariable int i) {
		return feeInstallmentService.retrieveFeeInstallmentById(i);
	}
	
	@GetMapping("/retrieveallfeeinstallmentsbyfee")
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(@RequestBody Fee f){
		return feeInstallmentService.retrieveAllFeeInstallmentsByFee(f);
	}

}
