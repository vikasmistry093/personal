package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String name;
	private String contact;
	private String email;
	private String password;
	private String status;
	private List<CardInfo> cardDetails;
	private List<AddressInfo> userAddress;
	private RecommendationInfo recommendation;
	private List<OrderInfo> orders;
	private WishListInfo wishList;
	private String type;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	
	public UserInfo() {}

	public UserInfo(Long userId, String name, String contact, String email, String password, String status,
			List<CardInfo> cardDetails, List<AddressInfo> userAddress, RecommendationInfo recommendation, List<OrderInfo> orders,
			WishListInfo wishList, String type, Timestamp createdTimestamp, Timestamp updatedTimestamp) {
		super();
		this.userId = userId;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.status = status;
		this.cardDetails = cardDetails;
		this.userAddress = userAddress;
		this.recommendation = recommendation;
		this.orders = orders;
		this.wishList = wishList;
		this.type = type;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<CardInfo> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(List<CardInfo> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public List<AddressInfo> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<AddressInfo> userAddress) {
		this.userAddress = userAddress;
	}
	
	public RecommendationInfo getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(RecommendationInfo recommendation) {
		this.recommendation = recommendation;
	}

	public List<OrderInfo> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderInfo> orders) {
		this.orders = orders;
	}

	public WishListInfo getWishList() {
		return wishList;
	}

	public void setWishList(WishListInfo wishList) {
		this.wishList = wishList;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
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
		return "User [userId=" + userId + ", name=" + name + ", contact=" + contact + ", email=" + email + ", password="
				+ password + ", status=" + status + ", cardDetails=" + cardDetails + ", userAddress=" + userAddress
				+ ", recommendation=" + recommendation + ", orders=" + orders + ", wishList=" + wishList + ", type=" + type
				+ ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}

}
