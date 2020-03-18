package com.syntax.class11;

import java.util.Scanner;

public class Task113 {

	public static void main(String[] args) {
		/*Accept username, password and confirm password from a user and check following requirements:

1-Username and Password cannot be  empty,
 if so→ message=“Username and Password cannot be empty”.
2-Password should be minimum 8 characters, 
if less → message=“Password is too short”.
3-Password cannot contain username if so,
 → message=“Password cannot contain username”.
4-Password should match confirmed password, if not 
 → message=“Passwords do not match”.

Only after all requirements met →
 message “Your username and password has been created”*/
		Scanner input=new Scanner(System.in);
		String username;
		String pasword;
		String passwordC;
		System.out.println("please enter your user name :");
	username=input.nextLine();
	System.out.println("please enter your password :");
	pasword=input.nextLine();
		 if(username.isEmpty()&& pasword.isEmpty()) {
			 System.out.println("Username and Password cannot empty");
			 if(pasword.length()<8) {
					System.out.println("password is too short");
					if(pasword.contains(username)) {
						 System.out.println("pssword cannot contain username");
						 System.out.println("please confirm your passwrdC");
						 passwordC=input.nextLine();
						 if(pasword.contentEquals(passwordC)) {
							 System.out.println("Passwords  match");
						 }else {
							 System.out.println("Passwords do not match");
						 }
					 }else {
						 System.out.println("Password not  contain username");
					 }
				}else {
					System.out.println("password is not short");
				}
		 }else {
			 System.out.println("lets proceed");
		 }
	
		
		 
		 
		 System.out.println("Your username and password has been created");

	}

}
