package com.syntax.class08;

import java.util.Scanner;

public class Creditcard {
	   public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
		   String answer;
		  
		   for(int i=1; i<=10; i++) {
			   System.out.println("apply for a credit card");
			   answer=scan.nextLine();
			  
		
			if(answer.equals("yes")) {
				   System.out.println("congrats");
				   break;
			   }
		   }
	   }
}