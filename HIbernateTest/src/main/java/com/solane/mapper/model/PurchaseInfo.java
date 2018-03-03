package com.solane.mapper.model;

import java.io.Serializable;
import java.util.List;

public class PurchaseInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long purchaseId;
	private UserInfo user;
	private List<ProductInfo> products;

	public PurchaseInfo() {}

	public PurchaseInfo(Long purchaseId, UserInfo user, List<ProductInfo> products) {
		super();
		this.purchaseId = purchaseId;
		this.user = user;
		this.products = products;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public List<ProductInfo> getProducts() {
		return products;
	}

	public void setProducts(List<ProductInfo> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", user=" + user + ", products=" + products + "]";
	}

}
