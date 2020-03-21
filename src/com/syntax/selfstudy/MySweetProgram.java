package com.syntax.selfstudy;

import java.util.Scanner;

public class MySweetProgram {
	public static void main(String [] args) {
		String password="let me in";
		System.out.println("guess the password :");
		
		Scanner scan=new Scanner(System.in);
		String guess=scan.nextLine();
		
		System.out.println(password.contentEquals(guess));
		//password==guess
				//primitives-this works
				//objects-this does not work!
				// values of objects is a refernce to the object
				int x=5;
		//String x=new String ("this is an object");
		//objects-this does not work!
		//values of objects is a reference to the object
		System.out.println(password.equals(guess));
		String a=new String("hi");
		String b=new String("hi");
		System.out.println(a==b);
				
		
		
	}

}
