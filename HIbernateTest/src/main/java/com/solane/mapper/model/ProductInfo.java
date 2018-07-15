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
	private String[] category;
	private List<ImageInfo> prouctImages;
	private String status;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	
	public ProductInfo(){}
	
	public ProductInfo(Long productId, String productTitle, Double price, Double discount, String description,
			String features, Integer rating, List<CategoryInfo> productCategory, String[] category, List<ImageInfo> prouctImages, String status,
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
		this.category = category;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
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

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public List<CategoryInfo> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<CategoryInfo> productCategory) {
		this.productCategory = productCategory;
	}
	
	public String[] getCategory() {
		return category;
	}
	
	public void setCategory(String[] category) {
		this.category = category;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductInfo other = (ProductInfo) obj;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	
}
