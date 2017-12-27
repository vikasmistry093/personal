package model;

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
}
