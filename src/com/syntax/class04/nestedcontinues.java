package com.syntax.class04;

public class nestedcontinues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check if patient has any allergies
		//if no allergies ---->you are healty
		
		
		
		boolean allergy=false;
		boolean appleallegy=true;
		boolean orangealegy=false;
		boolean kiwiallergy=true;
		
		if (allergy) {
			System.out.println("please answer below");
			if(orangealegy) {
				System.out.println("do not eat oranges");
			}if(appleallegy) {
				System.out.println("do not eat apple");
			}if(kiwiallergy) {
				System.out.println("do not eat kiwi");
			}
		}else {
			System.out.println("you are healthy");
		}
		

	}

}
