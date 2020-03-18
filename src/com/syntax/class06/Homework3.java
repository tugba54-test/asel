package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	private static String operator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter 2 numbers");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		double result = 0;
		System.out.println("please enter op");
		String op=scan.nextLine();
		
		switch(op) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
			default :
				System.out.println("unknown");
			
		}				
		System.out.println("result is "+ result);

	}

}
