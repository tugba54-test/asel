package com.syntax.class07;

import java.util.Scanner;

public class lopsandscanner {

	public static void main(String[] args) {
		// we want to ask user name and print good afternoon and name
		Scanner input1=new Scanner (System.in);
		
	
		String name;
		int num=1;
		
		System.out.println("please enter your name");
		name=input1.nextLine();
		while(num<=5) {
		System.out.println("good afternoon "+name); 
		  num++;
		}
		System.out.println("____-------->task");
		
		
					 
		 
		int num2 = 0 ;
		
		while(num2<17) {
		System.out.println("please guess any number 1-20");
		
		num2=input1.nextInt();
		num++;
	

	    if(num2==17) {
		System.out.println("congrulations");
	}
		}
	
	/*17 kere de bilemezse kesin yontem*/
		int number;
		int lnumber=17;
	do {
		System.out.println("please enter any number from1-20");	
		number=input1.nextInt();
	}while(number!=lnumber);
	System.out.println("you got it!...");
	
	
	
	
	
	
	
	
	
	
	
	}
}
