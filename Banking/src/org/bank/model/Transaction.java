package org.bank.model;

import java.sql.Timestamp;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	private long transactionID;
	
	@DateTimeFormat(pattern="DD/MM/YYYY")
	@Column(name="TRANSACTION_DATE",nullable=false)
	private Date transactionDate;
	
	@CreationTimestamp
	@Column(name="TRANSACTION_TMSTMP",nullable=false)
	private Timestamp transactionTimestamp;
	
	@Column(name="IFSC_CODE",nullable=false)
	private long ifscCode;
	
	@Column(name="BENIFICIARY_ACC_NO",nullable=false)
	private long benificiaryAccNo;
	
	@Column(name="BENIFICIARY_NAME",nullable=false)
	private String benificiaryName;
	
	@Column(name="BENIFICIARY_TYPE",nullable=false)
	private String benificiaryType;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TRANSACTION_AMT",nullable=false)
	private double transactionAmount;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	
	public Transaction() {	}
	
	
	public Transaction(long transactionID, Date transactionDate, Timestamp transactionTimestamp, long ifscCode,
			long benificiaryAccNo, String benificiaryName, String benificiaryType, String description,
			double transactionAmount, String transactionType) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.transactionTimestamp = transactionTimestamp;
		this.ifscCode = ifscCode;
		this.benificiaryAccNo = benificiaryAccNo;
		this.benificiaryName = benificiaryName;
		this.benificiaryType = benificiaryType;
		this.description = description;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}

	public Transaction(Date transactionDate, Timestamp transactionTimestamp, long ifscCode,
			long benificiaryAccNo, String benificiaryName, String benificiaryType, String description,
			double transactionAmount, String transactionType) {
		super();
		this.transactionDate = transactionDate;
		this.transactionTimestamp = transactionTimestamp;
		this.ifscCode = ifscCode;
		this.benificiaryAccNo = benificiaryAccNo;
		this.benificiaryName = benificiaryName;
		this.benificiaryType = benificiaryType;
		this.description = description;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}


	
	public long getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	public Timestamp getTransactionTimestamp() {
		return transactionTimestamp;
	}


	public void setTransactionTimestamp(Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}


	public long getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}


	public long getBenificiaryAccNo() {
		return benificiaryAccNo;
	}


	public void setBenificiaryAccNo(long benificiaryAccNo) {
		this.benificiaryAccNo = benificiaryAccNo;
	}


	public String getBenificiaryName() {
		return benificiaryName;
	}


	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}


	public String getBenificiaryType() {
		return benificiaryType;
	}


	public void setBenificiaryType(String benificiaryType) {
		this.benificiaryType = benificiaryType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
