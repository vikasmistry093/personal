package com.solaane.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PURCHASE")
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PURCHASE_ID")
	private long purchaseId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PURCHASED_PRODUCT", joinColumns={@JoinColumn(name="PURCHASE_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> products;
	
	public Purchase() {}

	public Purchase(long purchaseId, User user, List<Product> products) {
		super();
		this.purchaseId = purchaseId;
		this.user = user;
		this.products = products;
	}

	public long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", user=" + user + ", products=" + products + "]";
	}
	
}