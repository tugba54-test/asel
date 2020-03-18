package com.syntax.class06;

import java.util.Scanner;

public class Switchwithstring {

	public static void main(String[] args) {
		/* ask user wher he or she is from
		 * based on the country we will define favorite food
		 * your favorite food is_______
		 */
		Scanner input;
		String country = null;
		String food;
		
		input=new Scanner(System.in);
		System.out.println("please enter your country");
		 switch(country.toLowerCase()) {
		 case "morocco":
			 food="couscous";
			 break;
		 case "tacikistan":
			 food="osh";
			 break;
		 case"belarus":
			 food="potato";
			 break;
		 case "turkey":
			 food="baklava";
			 break;
		 case"afganistan":
			 food="manti";
			 break;
		 case "kazakistan":
			 food="besparmak";
			 break;
		default:
			food="unknown";
			
		 }
		 System.out.println("your favorite food is "+food);

	}

}
