package com.syntax.class08;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		   //Write a program to ask a user to enter item they want to buy and the price of that item. 
		  //Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		   //If user give more money program should return a change.
		     //Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner scan=new Scanner (System.in);
		int price = 0,left,pay,change,amount = 0;
		System.out.println("please enter the price");
		price=scan.nextInt();
		do {
			System.out.println("please pay the price");
			pay=scan.nextInt();
			amount=amount+pay;
			if(price>amount) {
				left=price-amount;
				System.out.println("please pay the left"+left);
			}else if(amount>price) {
				change=amount-price;
				System.out.println("this is your change"+change);
				break;
			}
		}while(price!=amount) ;
			System.out.println("thank you for shopping");
		
}	 
}		 		 
		 
		 
		 
		 
		 
		
		

	


