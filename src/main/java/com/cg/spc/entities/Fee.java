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

@Entity(name="FEE_1")
public class Fee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FEE_ID")
	private int feeId;
	
	@Column(name = "TOTAL_FEES_DUE")
	private double totalFeesDue;
	
	@Column(name = "TOTAL_FEES_RECEIVED")
	private double totalFeesReceived;
	
	@Column(name = "STARTING_MONTH")
	private LocalDate startMonthYear;
	
	@Column(name = "ENDING_MONTH")
	private LocalDate endMonthYear;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT")
	private Student student;
	
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}
	public double getTotalFeesDue() {
		return totalFeesDue;
	}
	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}
	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}
	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}
	public LocalDate getStartMonthYear() {
		return startMonthYear;
	}
	public void setStartMonthYear(LocalDate startMonthYear) {
		this.startMonthYear = startMonthYear;
	}
	public LocalDate getEndMonthYear() {
		return endMonthYear;
	}
	public void setEndMonthYear(LocalDate endMonthYear) {
		this.endMonthYear = endMonthYear;
	}
	public Fee(int feeId, double totalFeesDue, double totalFeesReceived, LocalDate startMonthYear,
			LocalDate endMonthYear) {
		super();
		this.feeId = feeId;
		this.totalFeesDue = totalFeesDue;
		this.totalFeesReceived = totalFeesReceived;
		this.startMonthYear = startMonthYear;
		this.endMonthYear = endMonthYear;
	}
	public Fee() {
		super();
	}
	
	

}
