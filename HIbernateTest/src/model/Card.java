package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD")
public class Card {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CARD_ID")
	private long cardId;
	
	@Column(name="CARD_NUMBER")
	private long cardNumber;
	
	@Column(name="OWNER_NAME")
	private String ownerName;
	
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

}
