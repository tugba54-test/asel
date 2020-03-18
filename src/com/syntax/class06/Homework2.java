package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, 
		 * any other grade -
		 * -> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		 */
		Scanner scan;
		char grade;
		String explanation;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your grade");
		grade= scan.next().charAt(0);
		
		switch(grade) {
		case'A':
			explanation="excellent";
			break;
		case'B':
			explanation="good";
			break;
		case'C':
			explanation="average";
			break;
		case'D':
			explanation="bad";
			break;
		     default:
			explanation="not acceptable";
			
		
		}System.out.println("you entered "+grade+" and your score is "+ explanation);
		

		 

	}

}
