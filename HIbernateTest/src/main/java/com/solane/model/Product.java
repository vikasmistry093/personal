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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@Column(name="PRODUCT_TITLE")
	private String productTitle;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="DISCOUNT")
	private double discount;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="FEATURES")
	private String features;
	
	@Column(name="RATING")
	private int rating;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PRODUCT_CATEGORY", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="CATEGORY_ID")})
	private List<Category> productCategory;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PRODUCT_IMAGE", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="IMAGE_ID")})
	private List<Image> prouctImages;

	@Column(name="STATUS")
	private String status;
	
	@Column(name="CREATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp createdTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP")
	@UpdateTimestamp
	private Timestamp updatedTimestamp;
	
	public Product() {}

	public Product(long productId, String productTitle, double price, double discount, String description,
			String features, int rating, List<Category> productCategory, List<Image> prouctImages, String status,
			Timestamp createdTimestamp, Timestamp updatedTimestamp) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.price = price;
		this.discount = discount;
		this.description = description;
		this.features = features;
		this.rating = rating;
		this.productCategory = productCategory;
		this.prouctImages = prouctImages;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<Category> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<Category> productCategory) {
		this.productCategory = productCategory;
	}

	public List<Image> getProuctImages() {
		return prouctImages;
	}

	public void setProuctImages(List<Image> prouctImages) {
		this.prouctImages = prouctImages;
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
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", price=" + price + ", discount="
				+ discount + ", description=" + description + ", features=" + features + ", rating=" + rating
				+ ", productCategory=" + productCategory + ", prouctImages=" + prouctImages + ", status=" + status
				+ ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}
	
}