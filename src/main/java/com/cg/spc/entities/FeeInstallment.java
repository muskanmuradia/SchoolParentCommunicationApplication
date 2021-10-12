package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="FEE_INSTALLMENT_1")
public class FeeInstallment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FEE_INSTALLMENT_ID")
	private int feeInstallmentId;
	
	@Column(name = "FEE_INSTALLMENT")
	private double feeInstallment;
	
	@Column(name = "DUE_DATE")
	private LocalDate dueDate;
	
	@Column(name = "FEE_PAYMENT_DATE")
	private LocalDate feePaymentDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FEE_COLUMN")
	private Fee fee;
	
	public int getFeeInstallmentId() {
		return feeInstallmentId;
	}
	public void setFeeInstallmentId(int feeInstallmentId) {
		this.feeInstallmentId = feeInstallmentId;
	}
	public double getFeeInstallment() {
		return feeInstallment;
	}
	public void setFeeInstallment(double feeInstallment) {
		this.feeInstallment = feeInstallment;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getFeePaymentDate() {
		return feePaymentDate;
	}
	public void setFeePaymentDate(LocalDate feePaymentDate) {
		this.feePaymentDate = feePaymentDate;
	}
	public FeeInstallment(int feeInstallmentId, double feeInstallment, LocalDate dueDate, LocalDate feePaymentDate) {
		super();
		this.feeInstallmentId = feeInstallmentId;
		this.feeInstallment = feeInstallment;
		this.dueDate = dueDate;
		this.feePaymentDate = feePaymentDate;
	}
	public FeeInstallment() {
		super();
	}
	
	

}
