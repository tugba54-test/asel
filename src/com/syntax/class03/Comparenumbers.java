package com.syntax.class03;

public class Comparenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1=10;
		double number2=10;
		
		if(number1>number2) {
			System.out.println("number one is larger than number 2");
		}else  if(number1<number2) {
			System.out.println("number one is smaller than number 2");
		}else if(number1==number2) {
			System.out.println("number1 is equal number2");
		}
		System.out.println("--------");
		
		int day=9;
		if(day==1) {
			System.out.println("it is monday,no class today");
		}else if(day==2) {
			System.out.println("it is tuesday, sdlc class today");
		}else if(day==3) {
			System.out.println("it is wednesday, sdlc class today");
		}else if(day==4) {
			System.out.println(" it is thurday,we have review today");
		}else if(day==5) {
			System.out.println("it is friday mood no class today");
		}else if(day==6) {
			System.out.println("it is saturday oof we have java class today");
		}else if(day==7) {
			System.out.println("it is sunday, java class today");
		}else if(day==9) {
			System.out.println("invalid day");
		}

	}

}
