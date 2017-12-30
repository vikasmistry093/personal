package org.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RATE_OF_INTEREST")
public class RateOfInterest 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RATE_OF_INTEREST_ID")
	private long rateOfInetrestID;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@Column(name="DESCRIPTION",nullable=false)
	private String description;
	
	@Column(name="INTEREST_RATE",nullable=false)
	private float interestRate;
	
	
	public RateOfInterest() {}
	
	public RateOfInterest(long rateOfInetrestID, String name, String description, float interestRate) {
		super();
		this.rateOfInetrestID = rateOfInetrestID;
		this.name = name;
		this.description = description;
		this.interestRate = interestRate;
	}

	

	
	public long getRateOfInetrestID() {
		return rateOfInetrestID;
	}

	public void setRateOfInetrestID(long rateOfInetrestID) {
		this.rateOfInetrestID = rateOfInetrestID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
}
