package model;

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

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private long userId;
	
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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
	
}
