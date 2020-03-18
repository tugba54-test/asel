package com.syntax.class06;

import java.util.Scanner;

public class Allinone {

	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale
		 * if there is no sale ------>not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate final price
		 * 
		 * if price less than 20---->apply 10%
		 * if price between20 and 100--->20
		 * PRICE 100-500 ------------>30
		 * price more than 500----->50
		 * 
		 * after discount _____ the price of the item reduced from_____ to_______
		 */
		Scanner input;
		String sale;
		double price;
	
		double discount = 0;
		double finalprice = 0;
		
		  Scanner scan = new Scanner(System.in);
		
		
			System.out.println("is there any sale today");
			sale=scan.nextLine();
			if (sale.equalsIgnoreCase("yes")) {
			System.out.println("please enter your price");
			
			price=scan.nextDouble();
			if (price<=20) {
				discount=price*0.1;
				finalprice=price-discount;
			}else if(price>20 && price<=100) {
				discount=price*0.2;
				finalprice=price-discount;
			}else if(price>=100 && price<=500) {
				discount=price*0.3;
				finalprice=price-discount;
			}else if(price >500) {
				discount=price*0.5;
				finalprice=price-discount;
				
			}
			System.out.println("after "+ discount +" discount the price of the item reduced from "+ price +" to "+finalprice );
		}else {
			System.out.println("not going to shopping today");


	}
	}
			

}
