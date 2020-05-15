package com.syntax.class34;

public class ThrowFinallySelf {
	
	public static void division(int num,int num1) {
		
		
		int result=0;
		if(num1==0) {
			
		throw new ArithmeticException("you can not give zero") ;
		}else {
			System.out.println(num/num1);
		}
		
	}
	
	public static void toplam(int num,int num2) {
		int result=0;
		if(num<0) {
			throw new ArithmeticException("you can not give zero") ;
			
		}else {
			System.out.println(num+num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(10,5);
		division(10,0);
division(20,4);

toplam(25,25);

	}

}
