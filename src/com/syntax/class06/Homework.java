package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it. 
		 * once values are captured print which language user speaks.

		 */
		Scanner scan;
		String language;
		String country;
		
		scan =new Scanner(System.in);
		System.out.println("please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		case"turkey":
			language="turkish";
			break;
		case "mexican":
			language="spanish";
			break;
		case "germany":
			language="german";
			break;
		case"denmark":
			language="danish";
			break;
		default:
			language="unknown";
			
		}
		System.out.println("your country is "+country+" you are speaking "+ language);
		
	}

}
