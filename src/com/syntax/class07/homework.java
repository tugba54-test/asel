package com.syntax.class07;

public class homework {

	public static void main(String[] args) {
		// homework 1
		int a=1;
		while(a<=100){                         //for(int a=1;a<=100; a++){
			System.out.println(a);             //syso(a);
		a++;
		}
		int b=100;
		while(b>=1) {
			System.out.println(b);
			b--;
		}
		//3 first way
		for(int c=20; c>=2; c--) {
			if(c%2==0) {
			
			System.out.print(c);
			}
			
		} 
		//printing even numbers 20-2
		  for(int i=20; i>=2; i-=2) {
			  if(i%2==0) {
				  System.out.println(i);
			  }
		  }
}
	}

