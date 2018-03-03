package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;


public class PaymentInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long paymentId;
	private String paymentType;
	private Double amount;
	private Timestamp createdTimestamp;
	
	public PaymentInfo() {}

	public PaymentInfo(Long paymentId, String paymentType, Double amount, Timestamp createdTimestamp) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.amount = amount;
		this.createdTimestamp = createdTimestamp;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", amount=" + amount
				+ ", createdTimestamp=" + createdTimestamp + "]";
	}

}
