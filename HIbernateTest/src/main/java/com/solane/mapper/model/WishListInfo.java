package com.solane.mapper.model;

import java.io.Serializable;
import java.util.List;

public class WishListInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long wishListId;
	private List<ProductInfo> products;
	public WishListInfo() {}

	public WishListInfo(Long wishListId, List<ProductInfo> products) {
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

	public List<ProductInfo> getProducts() {
		return products;
	}

	public void setProducts(List<ProductInfo> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WishList [wishListId=" + wishListId + ", products=" + products + "]";
	}

}
