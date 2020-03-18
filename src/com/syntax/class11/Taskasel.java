package com.syntax.class11;

import java.util.Scanner;

public class Taskasel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="Admin";
		String pass="Syntax1234";
		if(username.isEmpty()|| pass.isEmpty()) {
			System.out.println("Username and password can not be empty");
		} else {
			System.out.println("username:"+username);
			System.out.println("password:"+pass);
		}
		int check=pass.length();
		if(check<=8) {
			System.out.println("Password is too short..");
		}
		if(pass.contains("Admin")) {
			System.out.println("Password can not contain username!");
		}
		String expPass="Syntax1234";
		if(pass.equals(expPass)) {
			System.out.println("Password confirmed");
		} else {
			System.out.println("Password is not correct!");
		}
		System.out.println("****************** Complete check for username and password************************");
		if(!username.isEmpty()&& !pass.isEmpty()&& pass.length()>8 && !pass.contains("Admin")) {
			System.out.println("Your username and password are created");
		} else {
			System.out.println("Password do not match");
		}
	}
}
