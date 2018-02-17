package com.solaane.model;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CONTACT")
	private String contact;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="USER_CARDS", joinColumns={@JoinColumn(name="USER_ID")}, inverseJoinColumns={@JoinColumn(name="CARD_ID")})
	private List<Card> cardDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="USER_ADDRESS", joinColumns={@JoinColumn(name="USER_ID")}, inverseJoinColumns={@JoinColumn(name="ADDRESS_ID")})
	private List<Address> userAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="RECOMMENDATION")
	private Recommendation recommendation;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="USER_ORDERS", joinColumns={@JoinColumn(name="USER_ID")}, inverseJoinColumns={@JoinColumn(name="ORDER_ID")})
	private List<Order> orders;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="WISHLIST")
	private WishList wishList;

	@Column(name="CREATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp createdTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP")
	@UpdateTimestamp
	private Timestamp updatedTimestamp;
	
	public User() {}

	public User(long userId, String name, String contact, String email, String password, String status,
			List<Card> cardDetails, List<Address> userAddress, Recommendation recommendation, List<Order> orders,
			WishList wishList, Timestamp createdTimestamp, Timestamp updatedTimestamp) {
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
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
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

	public List<Card> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(List<Card> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public List<Address> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}

	public Recommendation getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Recommendation recommendation) {
		this.recommendation = recommendation;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public WishList getWishList() {
		return wishList;
	}

	public void setWishList(WishList wishList) {
		this.wishList = wishList;
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
				+ ", recommendation=" + recommendation + ", orders=" + orders + ", wishList=" + wishList
				+ ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}
	
}
