package org.bank.model;

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
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private long customerID;
	
	@Column(name="SALUTATION",nullable=false)
	private String slautation;
	
	@Column(name="FIRST_NAME",nullable=false)
	private String firstName;

	@Column(name="MIDDLE_NAME",nullable=false)
	private String middleName;
	
	@Column(name="LAST_NAME",nullable=false)
	private String lastName;
	
	@Column(name="ADDRESS",nullable=false)
	private String address;

	@DateTimeFormat(pattern="DD/MM/YYYY")
	@Column(name="DOB",nullable=false)
	private Date dob;

	@Column(name="EMAIL_ID",nullable=false)
	private String email;

	@Column(name="MOBILE_NUMBER",nullable=false)
	private long mobileNumber;
	
	@Column(name="PANCARD",nullable=false)
	private long pancard;
	
	@Column(name="AADHAR_CARD",nullable=false)
	private long aadharcard;
	
	@Column(name="NOMINEE_NAME")
	private String nomineeName;
	
	@Column(name="NOMINEE_RELATION")
	private String nomineeRelation;
	
	@CreationTimestamp
	@Column(name="CRTED_TMSTMP",nullable=false)
	private Timestamp createdTimestamp;
	
	@UpdateTimestamp
	@Column(name="UPTD_TMSTMP",nullable=false)
	private Timestamp updateTimestamp;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_DETAIL")
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CUSTOMER_ACCOUNT_DETAILS", joinColumns = {@JoinColumn(name="ACCOUNT_ID") }, inverseJoinColumns = { @JoinColumn(name="CUSTOMER_ID")})
	private List<Account> accounts;
	
	
	public Customer() { }

	
	

	public Customer(long customerID, String slautation, String firstName, String middleName,
			String lastName, String address, Date dob, String email, long mobileNumber, long pancard, long aadharcard,
			String nomineeName, String nomineeRelation, Timestamp createdTimestamp, Timestamp updateTimestamp,
			User user, List<Account> accounts) {
		super();
		this.customerID = customerID;
		this.slautation = slautation;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.pancard = pancard;
		this.aadharcard = aadharcard;
		this.nomineeName = nomineeName;
		this.nomineeRelation = nomineeRelation;
		this.createdTimestamp = createdTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.user = user;
		this.accounts = accounts;
	}




	public long getCustomerID() {
		return customerID;
	}


	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}


	public String getSlautation() {
		return slautation;
	}


	public void setSlautation(String slautation) {
		this.slautation = slautation;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public long getPancard() {
		return pancard;
	}


	public void setPancard(long pancard) {
		this.pancard = pancard;
	}


	public long getAadharcard() {
		return aadharcard;
	}


	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}


	public String getNomineeName() {
		return nomineeName;
	}


	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}


	public String getNomineeRelation() {
		return nomineeRelation;
	}


	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}


	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}


	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}


	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}


	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
