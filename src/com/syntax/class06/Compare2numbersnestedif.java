package com.syntax.class06;

import java.util.Scanner;

public class Compare2numbersnestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter any three numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int largest;
		
		
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
				
			}else {
				largest=num3;
			}
		}else {
			if(num2>num3) {
				largest=num2;
		     }else {
		    	 largest=num3;
		     }
			
			
		}
         System.out.println("largest number is "+largest);
	}

}
