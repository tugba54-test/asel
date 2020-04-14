package com.syntax.class26;

public class Registration {
	private String email;
	private String userName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
		this.email = email;
	}else {
		System.out.println("Email needs to be yahoo");}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6 ) {
	
		this.userName = userName;
		}else {
			System.out.println(" username can not be empty and it should be more than 6 charcters");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6 && (!password.contains(userName))) {
	this.password = password;
		}else {
			System.out.println("username can not be empty,contains user name and it should bemore than 6 charcters ");
		}
	}
	
	

}
