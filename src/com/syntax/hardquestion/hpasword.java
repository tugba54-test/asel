package com.syntax.hardquestion;

import java.util.Scanner;

public class hpasword {

	public static void main(String[] args) {
		// Accept username, password and confirm password from a user and check following requirements:
		//
//		Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//		Password should be minimum 8 characters, if less → message=“Password is too short”.
//		Password cannot contain username if so, → message=“Password cannot contain username”.
//		Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//		Only after all requirements met → message “Your username and password has been created
	Scanner scan=new Scanner(System.in);
	String user,password,confirmpas;
	System.out.println("please enter your username :");
	user=scan.nextLine();
	System.out.println("please enter your password");
	password=scan.nextLine();
	System.out.println("please enter confirm password");
	confirmpas=scan.nextLine();
	if(!(user.isEmpty()) || (password.isEmpty())){
		if(password.length()>=8) {
			if(!(password.contains(user)) ){
				System.out.println("confirmed");
				if(password.equalsIgnoreCase(confirmpas)) {
					System.out.println("your account is created");
				}else {
					System.out.println("invalid password");
				}
			
				
			}else {
				System.out.println("Password cannot contain username");
			}
			
			
			
		}else {
			System.out.println("Password too short");
		}
	}else {
		System.out.println("username and password can not be empty");
	}

	}

}
