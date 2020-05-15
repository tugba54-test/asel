package com.syntax.class34;

public class taskAge {
	public static void ageEligibility(int age) {
		if(age<16) {
			throw new RuntimeException("You must be older then 16 to start university");
		}else {
			System.out.println("You can start universty");
		}
	}

	public static void main(String[] args) {
		 ageEligibility(13);
		
	}

}
