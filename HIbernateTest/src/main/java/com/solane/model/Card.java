package com.solane.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD")
public class Card implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CARD_ID")
	private Long cardId;
	
	@Column(name="CARD_NUMBER")
	private long cardNumber;
	
	@Column(name="OWNER_NAME")
	private String ownerName;
	
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	public Card() {}

	public Card(Long cardId, long cardNumber, String ownerName, Date expiryDate) {
		super();
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.ownerName = ownerName;
		this.expiryDate = expiryDate;
	}

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardNumber=" + cardNumber + ", ownerName=" + ownerName + ", expiryDate="
				+ expiryDate + "]";
	}
	
}
