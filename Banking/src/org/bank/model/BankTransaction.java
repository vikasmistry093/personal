package org.bank.model;

import java.sql.Timestamp;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TRANSACTION")
public class BankTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	private long transactionID;

	@ManyToOne(cascade=CascadeType.ALL)
	private Account account;
	
	@DateTimeFormat(pattern="DD/MM/YYYY")
	@Column(name="TRANSACTION_DATE",nullable=false)
	private Date transactionDate;
	
	@CreationTimestamp
	@Column(name="TRANSACTION_TMSTMP",nullable=false)
	private Timestamp transactionTimestamp;
	
	/*@Column(name="IFSC_CODE")
	private long ifscCode;*/
	
	@Column(name="BENIFICIARY_ACC_NO",nullable=false)
	private long benificiaryAccNo;
	
	@Column(name="BENIFICIARY_NAME",nullable=false)
	private String benificiaryName;
	
	@Column(name="BENIFICIARY_TYPE")
	private String benificiaryType;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TRANSACTION_AMT",nullable=false)
	private float transactionAmount;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	
	
	public long getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
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

/*
	public long getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}
*/

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


	public float getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
