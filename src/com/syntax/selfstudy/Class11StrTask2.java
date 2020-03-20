package com.syntax.selfstudy;

import java.util.Scanner;

public class Class11StrTask2 {

	public static void main(String[] args) {
//		Accept username, password and confirm password from a user and check following requirements:
//
//			Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//			Password should be minimum 8 characters, if less → message=“Password is too short”.
//			Password cannot contain username if so, → message=“Password cannot contain username”.
//			Password should match confirmed password, if not  → message=“Passwords do not match”.
//			Only after all requirements met → message “Your username and password has been created”
//		String user="Tugba54-test";
//		String pass="12345678";
//		String pass1="123456";
		Scanner scan;
		scan = new Scanner(System.in);
		String pass1 = null;
		System.out.println("Please enter your username");
		String user = scan.nextLine();
		System.out.println("Please enter your password");
		String pass = scan.nextLine();
		System.out.println("Please enter your con firmpassword");
		pass1 = scan.nextLine();
		if (!(user.isEmpty()) || (pass.isEmpty())) {//ikiside bos olmayinca false and false not ! la true olacak
			System.out.println("Username and Password not empty");
			if (pass.length() >= 8) {
				System.out.println("password length is good");
				if (!(pass.contains(user))) {
					System.out.println("Password do not  contain username");
					if (pass.equals(pass1)) {
						
						System.out.println("passwords are matched your accaunt is created");
						
					} else {
						System.out.println("Passwords are not matched");
					}
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and password cannot be empty");
		}
	}
}
