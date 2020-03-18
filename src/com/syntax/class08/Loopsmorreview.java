package com.syntax.class08;

public class Loopsmorreview {

	public static void main(String[] args) {
		// write a program to calculate sum of odds and sum of even numbers
		//1 to 99
		// even numbers
	int evensm=0;
	int oddsm=0;
	int sum=evensm+oddsm;
		
		for(int a=2; a<=99; a++) {
			if(a%2==0) {
			evensm=evensm+a;
		} 
		}System.out.println( "even"+evensm);	
			for (int b=1; b<=99; b++) {
			if(b%2!=0) {
				oddsm=oddsm+b;
		}
			
			
		}System.out.println("odd"+oddsm);
		
				
		

	}
	}

