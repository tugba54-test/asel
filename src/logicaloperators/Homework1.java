package logicaloperators;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your birth month");
		String month=scan.next();
		
		String season = null;
		if(month.contentEquals("january") || month.contentEquals("february") || month.contentEquals("december")) {
			season="winter";
		}else if(month.equals("april") || month.contentEquals("may") || month.contentEquals("march")) {
			season="spring";
		}else if (month.contentEquals("july") || month.contentEquals("august") || month.contentEquals("june")) {
			season="summer";
		}else  if(month.contentEquals("september") || month.contentEquals("october") || month.contentEquals("november")) {
			season="autumn";
		}else {
			//season="unknown";
			System.out.println("please enter valid month");
			
		}
		System.out.println("you were born in "+ season);

	}

}
