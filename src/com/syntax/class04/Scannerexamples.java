package com.syntax.class04;

import java.util.Scanner;

public class Scannerexamples {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("do you have diploma");
		boolean diploma=input.nextBoolean();
		
		if(diploma) {
			System.out.println("congratulatons");
			System.out.println("please enter  your gpa score");
			int score=input.nextInt();
			if (score>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else {
				System.out.println("you should have studied harder");
			}
		
	   }else {
		   System.out.println("you should get a degree");
	   }
	}
   }

	
		
		

	
		
		
		

		
		
		

		
		

  
	    
	    

	


