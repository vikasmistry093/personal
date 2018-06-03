package com.solane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_PROCESS_HISTORY")
public class ProductProcessingHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_HISTORY_ID")
	private Long productProcessingHistoryId;
	
	@OneToOne
	@JoinColumn(name="PRODUCT")
	private Product product;
	
	@Column(name="PREVIOUS_HISTORY")
	private String previousHistory;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToOne
	@JoinColumn(name="ADMIN_USER")
	private AdminUser user;
	
	public ProductProcessingHistory(){}
	
	public ProductProcessingHistory(Long productProcessingHistoryId, Product product, String previousHistory,
			String description, AdminUser user) {
		super();
		this.productProcessingHistoryId = productProcessingHistoryId;
		this.product = product;
		this.previousHistory = previousHistory;
		this.description = description;
		this.user = user;
	}

	public Long getProductProcessingHistoryId() {
		return productProcessingHistoryId;
	}

	public void setProductProcessingHistoryId(Long productProcessingHistoryId) {
		this.productProcessingHistoryId = productProcessingHistoryId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getPreviousHistory() {
		return previousHistory;
	}

	public void setPreviousHistory(String previousHistory) {
		this.previousHistory = previousHistory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AdminUser getUser() {
		return user;
	}

	public void setUser(AdminUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ProductProcessingHistory [productProcessingHistoryId=" + productProcessingHistoryId + ", product="
				+ product + ", previousHistory=" + previousHistory + ", description=" + description + ", user=" + user
				+ "]";
	}
	
}
