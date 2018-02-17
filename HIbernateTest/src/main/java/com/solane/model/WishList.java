package com.solane.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="WISHLIST")
public class WishList {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WISHLIST_ID")
	private long wishListId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="WISHED_PRODUCTS", joinColumns={@JoinColumn(name="WISHLIST_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> products;
	
	public WishList() {}

	public WishList(long wishListId, List<Product> products) {
		super();
		this.wishListId = wishListId;
		this.products = products;
	}

	public long getWishListId() {
		return wishListId;
	}

	public void setWishListId(long wishListId) {
		this.wishListId = wishListId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WishList [wishListId=" + wishListId + ", products=" + products + "]";
	}
	
}
