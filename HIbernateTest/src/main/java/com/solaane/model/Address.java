package com.solaane.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	
	@Column(name="CREATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp createdTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP")
	@UpdateTimestamp
	private Timestamp udatedTimeStamp;

	public Address() {}
	
	public Address(long addressId, String street, String landMark, String city, String pin, String state,
			Timestamp createdTimestamp, Timestamp udatedTimeStamp) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.createdTimestamp = createdTimestamp;
		this.udatedTimeStamp = udatedTimeStamp;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Timestamp getUdatedTimeStamp() {
		return udatedTimeStamp;
	}

	public void setUdatedTimeStamp(Timestamp udatedTimeStamp) {
		this.udatedTimeStamp = udatedTimeStamp;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", landMark=" + landMark + ", city=" + city
				+ ", pin=" + pin + ", state=" + state + ", createdTimestamp=" + createdTimestamp + ", udatedTimeStamp="
				+ udatedTimeStamp + "]";
	}
	
}
