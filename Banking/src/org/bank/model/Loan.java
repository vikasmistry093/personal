package org.bank.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="LOAN")
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOAN_ID")
	private long loanId;
	
	@Column(name="LOAN_AMOUNT")
	private float loanAmount;
	
	@Column(name="LOAN_TYPE")
	private String loanType;
	
	@Column(name="LOAN_PERIOD" )
	private int loanPeriod;
	
	@Column(name="LOAN_DOCUMENT")
	private String loanDocument;
	
	@Column(name="LOAN_STATUS")
	private String loanStatus;
	
	@Column(name="LOAN_EMI" )
	private float loanEmi;
	
	@Column(name="STATUS")
	private String status;
	
	@CreationTimestamp
	@Column(name="CREATED_LOAN_TS")
	private Timestamp createdTimestamp;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="RATE_OF_INTEREST")
	private RateOfInterest rateOfInterest;

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public String getLoanDocument() {
		return loanDocument;
	}

	public void setLoanDocument(String loanDocument) {
		this.loanDocument = loanDocument;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public float getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(float loanEmi) {
		this.loanEmi = loanEmi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	
	public RateOfInterest getRateOfInterest() {
		return rateOfInterest;
	}
	
	public void setRateOfInterest(RateOfInterest rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
}
