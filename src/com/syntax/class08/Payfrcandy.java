package com.syntax.class08;

import java.util.Scanner;

public class Payfrcandy {

	public static void main(String[] args) {
		/*
		 * ask a user to pay for a candy
		 * as long as the enterd price is not 2
		 * we need keep ask for paying
		 * one amount is correct---->enjoy your candy
		 */
		Scanner scan =new Scanner(System.in);
		double price;
		
//		do { 
		//System.out.println("please pay for a candy");
		//price=scan.nextDouble();
	//	}while(price!=2);
//		System.out.println("enjoy for your candy");
		
		
		

		System.out.println("please pay for a candy");
		price=scan.nextDouble();
		while(price!=2) {
			System.out.println("please pay for a candy ");
			price=scan.nextDouble();
		}
		System.out.println("enjoy your candy");
	}

}
