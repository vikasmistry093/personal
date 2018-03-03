package com.solane.mapper.model;

import java.sql.Timestamp;
import java.util.List;

public class ProductInfo {
	
	private Long productId;
	private String productTitle;
	private Double price;
	private Double discount;
	private String description;
	private String features;
	private Integer rating;
	private List<CategoryInfo> productCategory;
	private List<ImageInfo> prouctImages;
	private String status;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	
	public ProductInfo(){}
	
	public ProductInfo(Long productId, String productTitle, double price, double discount, String description,
			String features, int rating, List<CategoryInfo> productCategory, List<ImageInfo> prouctImages, String status,
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
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

	public List<CategoryInfo> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<CategoryInfo> productCategory) {
		this.productCategory = productCategory;
	}

	public List<ImageInfo> getProuctImages() {
		return prouctImages;
	}

	public void setProuctImages(List<ImageInfo> prouctImages) {
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
		return "ProductInfo [productId=" + productId + ", productTitle=" + productTitle + ", price=" + price
				+ ", discount=" + discount + ", description=" + description + ", features=" + features + ", rating="
				+ rating + ", productCategory=" + productCategory + ", prouctImages=" + prouctImages + ", status="
				+ status + ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}
	
}
