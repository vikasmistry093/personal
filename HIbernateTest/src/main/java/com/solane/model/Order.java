package com.solane.model;

import java.sql.Timestamp;
import java.util.List;

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
@Table(name="ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Long orderId;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ORDERED_PRODUCT", joinColumns={@JoinColumn(name="ORDER_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> orderedProduct;
	
	@JoinColumn(name="PAYMENT")
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	
	@Column(name="STATUS")
	private String status;
	
	@CreationTimestamp
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@UpdateTimestamp
	@Column(name="UPATED_TIMESTAMP")
	private Timestamp updatedTimestamp;
	
	public Order() {}

	public Order(long orderId, List<Product> orderedProduct, Payment payment, String status, Timestamp createdTimestamp,
			Timestamp updatedTimestamp) {
		super();
		this.orderId = orderId;
		this.orderedProduct = orderedProduct;
		this.payment = payment;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<Product> getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(List<Product> orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
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
