package com.syntax.class31;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		int x=1;
		do {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
		int sum=num1/num2;
		System.out.println(sum);
		x=2;
		}
  
  catch(Exception e) {//if anything wrong
	  System.out.println("you can not do that ");
  }
		
	}while(x==1);
	
	}
}
