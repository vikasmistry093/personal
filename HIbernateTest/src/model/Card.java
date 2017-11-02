package model;

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

	public long getCardId() {
		return cardId;
	}

	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	
}
