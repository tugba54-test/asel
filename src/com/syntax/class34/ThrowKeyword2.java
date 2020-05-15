package com.syntax.class34;

public class ThrowKeyword2 {

	public static void main(String[] args) {
		
		NullPointerException npe=new NullPointerException();
		//throw npe;
		//throwException();
		//withdraw(100,50);
		withdraw(50,100);

	}
	public static void withdraw(int balance,int amount) {
		if(amount>balance) {
			throw new BalanceException("Your balance is too low");
		}
	}
	
	
	
	
	public static void throwException() {
		throw new ArithmeticException();//expilicitly throw aritmetic exception
		
	}

}
