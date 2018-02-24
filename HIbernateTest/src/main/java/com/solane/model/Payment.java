package com.solane.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="PAYMENT")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PAYMENT_ID")
	private Long paymentId;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@CreationTimestamp
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	public Payment() {}

	public Payment(long paymentId, String paymentType, double amount, Timestamp createdTimestamp) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.amount = amount;
		this.createdTimestamp = createdTimestamp;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
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

	public void setAmount(double amount) {
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
