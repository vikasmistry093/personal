package org.bank.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="LOAN")
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOAN_ID")
	private long loan_id;
	
	@Column(name="LOAN_AMOUNT",nullable=false)
	private Double loanamount;
	
	@Column(name="LOAN_TYPE", nullable=false)
	private String loantype;
	
	@Column(name="LOAN_PERIOD", nullable=false )
	private int loanperiod;
	
	@Column(name="LOAN_DOCUMENT" ,nullable=false)
	private String loandocument;
	
	@Column(name="LOAN_STATUS", nullable=false)
	private String loanstatus;
	
	@Column(name="LOAN_EMI", nullable=false )
	private float loanemi;
	
	@Column(name="STATUS", nullable=false)
	private String status;
	
	@CreationTimestamp
	@Column(name="CREATED_LOAN_TS")
	private LocalDateTime createdtimestamp;
	
	public Loan() { }

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public Double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(Double loanamount) {
		this.loanamount = loanamount;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public int getLoanperiod() {
		return loanperiod;
	}

	public void setLoanperiod(int loanperiod) {
		this.loanperiod = loanperiod;
	}

	public String getLoandocument() {
		return loandocument;
	}

	public void setLoandocument(String loandocument) {
		this.loandocument = loandocument;
	}

	public String getLoanstatus() {
		return loanstatus;
	}

	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}

	public float getLoanemi() {
		return loanemi;
	}

	public void setLoanemi(float loanemi) {
		this.loanemi = loanemi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedtimestamp() {
		return createdtimestamp;
	}

	public void setCreatedtimestamp(LocalDateTime createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}
	
	
}
