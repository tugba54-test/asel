package com.syntax.class06;

import java.util.Scanner;

public class Switchintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("please enter gender");
		 char gender=input.nextLine().charAt(0);
		
		String genderType;
		switch (gender) {
		case 'M':
			genderType="male";
			break;
		case'F':
			genderType="female";
			break;
			default:
				genderType="unknown";
			
		}
		System.out.println("your gender is"+genderType);
		

	}

}
