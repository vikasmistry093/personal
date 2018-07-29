package com.solane.mapper.model;

public class ProductProcessingHistoryInfo {
	
	private Long productProcessingHistoryId;
	private ProductInfo product;
	private String previousHistory;
	private String description;
	private String adminUserId;
	private UserInfo userInfo;
	private AdminUserInfo user;
	
	public ProductProcessingHistoryInfo(){}
	
	public ProductProcessingHistoryInfo(Long productProcessingHistoryId, ProductInfo product, String previousHistory,
			String description, String adminUserId, UserInfo userInfo, AdminUserInfo user) {
		super();
		this.productProcessingHistoryId = productProcessingHistoryId;
		this.product = product;
		this.previousHistory = previousHistory;
		this.description = description;
		this.adminUserId = adminUserId;
		this.userInfo = userInfo;
		this.user = user;
	}

	public Long getProductProcessingHistoryId() {
		return productProcessingHistoryId;
	}

	public void setProductProcessingHistoryId(Long productProcessingHistoryId) {
		this.productProcessingHistoryId = productProcessingHistoryId;
	}

	public ProductInfo getProduct() {
		return product;
	}

	public void setProduct(ProductInfo product) {
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
	
	public String getAdminUserId() {
		return adminUserId;
	}
	
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public AdminUserInfo getUser() {
		return user;
	}

	public void setUser(AdminUserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ProductProcessingHistoryInfo [productProcessingHistoryId=" + productProcessingHistoryId + ", product="
				+ product + ", previousHistory=" + previousHistory + ", description=" + description + ", adminUserId="
				+ adminUserId + ", userInfo="  + userInfo + ", user=" + user + "]";
	}
	
}
