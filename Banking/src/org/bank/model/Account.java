package org.bank.model;

import java.sql.Timestamp;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="ACCOUNT")
public class Account
{
	
	public static enum accountType { CREDIT, DEBIT, LOAN }
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCOUNT_ID")
	private long accountID;
	
	@Column(name="ACCOUNT_NUMBER",unique=true)
	private long accountNumber;
	
	@Column(name="ACCOUNT_TYPE",nullable=false)
	private String accountType;
	
	@CreationTimestamp
	@Column(name="CRTED_TMSTMP",nullable=false)
	private Timestamp createTimestamp;
	
	@UpdateTimestamp
	@Column(name="UPTD_TMSTMP",nullable=false)
	private Timestamp updateTimestamp;
	
	@Column(name="BALANCE",columnDefinition = "int default 0",nullable=false)
	private double balance;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="RATE_OF_INTEREST")
	private RateOfInterest rateOfInterest;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinTable(name="ACCOUNT_CARD_DETAILS", joinColumns = {@JoinColumn(name="ACCOUNT_ID") }, inverseJoinColumns = { @JoinColumn(name="CARD_ID")})
	private List<Cards> cardDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ACCOUNT_TRANSACTION_DETAILS", joinColumns = {@JoinColumn(name="ACCOUNT_ID") }, inverseJoinColumns = { @JoinColumn(name="TRASACTION_ID")})
	private List<Transaction> transactionDetails;

	
	public Account() {}

	public Account(long accountID,long accountNumber, String accountType, Timestamp createTimestamp,
			Timestamp updateTimestamp, double balance, RateOfInterest rateOfInterest, List<Cards> cardDetails,
			List<Transaction> transactionDetails) {
		super();
		this.accountID=accountID;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
		this.cardDetails = cardDetails;
		this.transactionDetails = transactionDetails;
	}
	
	public Account(long accountNumber, String accountType, Timestamp createTimestamp,
			Timestamp updateTimestamp, double balance, RateOfInterest rateOfInterest, List<Cards> cardDetails,
			List<Transaction> transactionDetails) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
		this.cardDetails = cardDetails;
		this.transactionDetails = transactionDetails;
	}

	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public RateOfInterest getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(RateOfInterest rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public List<Cards> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(List<Cards> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public List<Transaction> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<Transaction> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

}
