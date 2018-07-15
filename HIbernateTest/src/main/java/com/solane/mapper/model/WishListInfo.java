package com.solane.mapper.model;

import java.io.Serializable;
import java.util.Set;

public class WishListInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long wishListId;
	private Set<ProductInfo> products;
	public WishListInfo() {}

	public WishListInfo(Long wishListId, Set<ProductInfo> products) {
		super();
		this.wishListId = wishListId;
		this.products = products;
	}

	public Long getWishListId() {
		return wishListId;
	}

	public void setWishListId(Long wishListId) {
		this.wishListId = wishListId;
	}

	public Set<ProductInfo> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductInfo> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WishList [wishListId=" + wishListId + ", products=" + products + "]";
	}

}
