package com.syntax.class11;

public class RyhnStringmanipu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="kubrabusra.com";
		String phone="9999997999";
		String psword="password1234";
		if(!email.isEmpty()) {
			System.out.println("email is available");
			if(!email.contains("@") &&(email.contains("."))) {
				System.out.println("but email is not valid");
			}else {
				System.out.println("email is a valid one!!!");
			}
		}else{
			System.out.println("please provide an email");
			
		}
		System.out.println("---baska bir ornek--->");
		String str="good morning, students";
		boolean contains=str.contains("hello");
				System.out.println(contains);

	}

}
