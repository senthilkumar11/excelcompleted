package com.premium.stc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
public class User {
	@Id
	private int id;
	@Column(name="username")
	private String userName;
	private String password;
	@Column(name="usertype")
	private String userType;
	private String email;
	@Column(name="mobilenumber")
	private long mobileNumber;
	private byte confirmed;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(byte confirmed) {
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", Password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + "]";
	}
	
	
}
