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
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="LANDMARK")
	private String landMark;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PIN")
	private String pin;
	
	@Column(name="STATE")
	private String state;

}
