package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class OrderInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long orderId;
	private List<ProductInfo> orderedProduct;
	private PaymentInfo payment;
	private String status;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	
	public OrderInfo() {}

	public OrderInfo(Long orderId, List<ProductInfo> orderedProduct, PaymentInfo payment, String status, Timestamp createdTimestamp,
			Timestamp updatedTimestamp) {
		super();
		this.orderId = orderId;
		this.orderedProduct = orderedProduct;
		this.payment = payment;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public List<ProductInfo> getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(List<ProductInfo> orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	public PaymentInfo getPayment() {
		return payment;
	}

	public void setPayment(PaymentInfo payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Timestamp getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderedProduct=" + orderedProduct + ", payment=" + payment + ", status="
				+ status + ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}

}
