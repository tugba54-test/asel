package com.syntax.class03;

public class Ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting coding");
		int num=178;
		if(num>1000) {
			System.out.println("my number is large");
		}
		System.out.println("end of the program");
		
		System.out.println("-------");
		
		int expectedhours=15;
		int actualhours=15;
		if(actualhours>expectedhours) {
			System.out.println("you will love java");
		}else {
			System.out.println("you will not like java");
			
			System.out.println("--------");
			
			double mybudget=100000;
			double carprice=12000;
			if(mybudget>carprice) {
				System.out.println("i  will buy this car today");
				System.out.println("i will be happy");
			}else {
				System.out.println("i will not buy this car today"+" i will go learn java");
				System.out.println("i will be motivated");
			}
			System.out.println("i am code after if condition");
		}

	}

}
