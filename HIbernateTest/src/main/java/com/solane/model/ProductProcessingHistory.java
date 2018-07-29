package com.solane.model;

import java.io.Serializable;

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
public class ProductProcessingHistory implements Serializable {

	private static final long serialVersionUID = 1L;

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
	@JoinColumn(name="REG_USER")
	private User user;
	
	@OneToOne
	@JoinColumn(name="ADMIN_USER")
	private AdminUser admin_user;
	
	public ProductProcessingHistory(){}
	
	public ProductProcessingHistory(Long productProcessingHistoryId, Product product, String previousHistory,
			String description, User user, AdminUser admin_user) {
		super();
		this.productProcessingHistoryId = productProcessingHistoryId;
		this.product = product;
		this.previousHistory = previousHistory;
		this.description = description;
		this.user = user;
		this.admin_user = admin_user;
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
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public AdminUser getAdmin_user() {
		return admin_user;
	}
	
	public void setAdmin_user(AdminUser admin_user) {
		this.admin_user = admin_user;
	}

	@Override
	public String toString() {
		return "ProductProcessingHistory [productProcessingHistoryId=" + productProcessingHistoryId + ", product="
				+ product + ", previousHistory=" + previousHistory + ", description=" + description + ", customer=" + user +", user=" + admin_user
				+ "]";
	}
	
}
