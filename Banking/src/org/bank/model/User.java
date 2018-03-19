package org.bank.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USERS")
public class User {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private long userID;
	
	@Column(name="USER_NAME", unique=true )
	@NotEmpty(message="User Name cannot be empty")
	@NotNull(message="Enter User Name")
	private String userName;
	
	@Column(name="USER_PASSWORD",nullable=false)
	@NotEmpty(message="Password cannot be empty")
	@NotNull(message="Enter Password")
	private String userPassword;
	
	@Column(name="OLD_USER_PASSWORD")
	private String oldUserPassword; 
	
	@Column(name="USER_TYPE",nullable=false)
	private String userType;
	
	@UpdateTimestamp
	@Column(name="LAST_LOGIN_TMSTMP")
	private Timestamp lastLoginTime;
	

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}
	
	public void setOldUserPassword(String oldUserPassword) {
		this.oldUserPassword = oldUserPassword;
	}
	
	public String getOldUserPassword() {
		return oldUserPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String string) {
		this.userType = string;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	
}
