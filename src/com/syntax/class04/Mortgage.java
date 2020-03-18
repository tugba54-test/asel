package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate=2.5;
		int price=190000;
		
		if(rate>4.5){
			System.out.println("not buy a house");
			
		}else {
			System.out.println("buy a house");
		
		}if (price>200000) {
			System.out.println("you should take a loan");
		}else if(price<200000) {
			System.out.println("pay cash");
		}

	}

}
