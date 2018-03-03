package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class AddressInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long addressId;
	private String street;
	private String landMark;
	private String city;
	private String pin;
	private String state;
	private Timestamp createdTimestamp;
	private Timestamp udatedTimeStamp;

	public AddressInfo() {}

	public AddressInfo(Long addressId, String street, String landMark, String city, String pin, String state,
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

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
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
