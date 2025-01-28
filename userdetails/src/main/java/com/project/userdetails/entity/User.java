package com.project.userdetails.entity;

public class User {

	private String userName;
	private String emailId;
	private String phoneNumber;
	
	public User(String userName, String emailId, String phoneNumber) {
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	public User() {
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
