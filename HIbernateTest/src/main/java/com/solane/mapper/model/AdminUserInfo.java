package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class AdminUserInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String name;
	private String contact;
	private String email;
	private String password;
	private String status;
	private String type;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	
	public AdminUserInfo() {}

	public AdminUserInfo(Long userId, String name, String contact, String email, String password, String status,
			String type, Timestamp createdTimestamp, Timestamp updatedTimestamp) {
		super();
		this.userId = userId;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.status = status;
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
		return "AdminUser [userId=" + userId + ", name=" + name + ", contact=" + contact + ", email=" + email
				+ ", password=" + password + ", status=" + status + ", type=" + type + ", createdTimestamp="
				+ createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}

}
