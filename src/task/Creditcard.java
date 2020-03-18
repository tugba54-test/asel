package task;

import java.util.Scanner;

public class Creditcard {

	public static void main(String[] args) {
		
		Scanner sld=new Scanner(System.in);
		System.out.println("Do you have a credit card");
		boolean cart=sld.nextBoolean();
		if(cart) {
			System.out.println("what is the balance on the card");
			int balance=sld.nextInt();
			if(balance>1000) {
				System.out.println("please pay off immediately");
			}else  if(balance<1000) {
				System.out.println("you can spend more");
			}
			

	}else {
		System.out.println("would you like to open credit card?");
	}

	}
}	
