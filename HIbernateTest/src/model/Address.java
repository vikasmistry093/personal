package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private long addressId;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	
}
