package org.bank.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARDS")
public class Cards {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CARD_ID")
	private long cardID;
	
	@Column(name="CARD_NAME",nullable=false)
	private String cardName;
	
	@Column(name="CVV_NUMBER",nullable=false)
	private long cvvNumber;
	
	@Column(name="CARD_TYPE",nullable=false)
	private String cardType; 
	
	@Column(name="CARD_NUMBER",nullable=false)
	private long cardNumber;
	
	@Column(name="EXPIRY_DETAILS",nullable=false)
	private Date expiryDate;
	

	public long getCardID() {
		return cardID;
	}

	public void setCardID(long cardID) {
		this.cardID = cardID;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public long getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(long cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	
}
