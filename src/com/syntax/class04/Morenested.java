package com.syntax.class04;

public class Morenested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isfriday=false;
		int date=14;
		
		if(isfriday) {
			System.out.println("today is friday,i am going to a movies");
			
			if (date==13) {
				System.out.println("i'll watch a scary movie");
			}else {
				System.out.println("i'll watch a comedy");
			}
		}else {
			System.out.println("today is not friday, i am staying home");
		}

	}

}
