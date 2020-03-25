package com.syntax.class13;

public class Fibonacci {

	public static void main(String[] args) {
		// print first 10 fibonacci numbers
		int a,b,c;
		a=0;b=1;
		
		for(int i=1;i<=10;i++) {
			
			System.out.print(a+"  ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
