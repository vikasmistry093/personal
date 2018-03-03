package com.solane.mapper.model;

import java.io.Serializable;
import java.util.Date;

public class CardInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long cardId;
	private Long cardNumber;
	private String ownerName;
	private Date expiryDate;
	
	public CardInfo(){}

	public CardInfo(Long cardId, Long cardNumber, String ownerName, Date expiryDate) {
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

	public void setCardNumber(Long cardNumber) {
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
