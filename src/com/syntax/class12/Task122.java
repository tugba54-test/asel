package com.syntax.class12;

import java.util.Scanner;

public class Task122 {

	public static void main(String[] args) {
		/* Write a program that reads two people’s first names and if they expecting boy or girl?
		Based on the input suggests a name for a baby:
			Example Output:                               
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
			
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL*/
		
		Scanner scan=new Scanner(System.in);
		String mom=scan.next();
		System.out.println("mom's first name? "+mom);
		String dad=scan.next();
		System.out.println("dad's first name"+dad);
		String gender=scan.next();
		System.out.println("Boy or girl"+gender);
		String letter;
		int dads;
		int moms;
		if(gender.equalsIgnoreCase("boy")) {
			dads=((dad.length()-1)/2);
			moms=((mom.length()-1)/2);
			System.out.println(dad.substring(0,dads)+mom.substring(0,moms));
		}else {
			
				dads=(dad.length()%2);
				moms=(mom.length()%2);
				System.out.println(mom.substring(0,moms)+dad.substring(0,dads));
		}

			

	}

}
