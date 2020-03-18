package logicaloperators;

import java.util.Scanner;

public class Reply35 {

	public static void main(String[] args) {
		/*Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   
*/
		Scanner input=new Scanner(System.in);
		int score;
		String eligibility =null ;
		
		System.out.println("Do you need a loan?");
		boolean loan=input.nextBoolean();
		if(loan) { 
		System.out.println("What is your credit score?");
		score=input.nextInt();
		
		 if(score<=600) 
			eligibility="Not eligible";
		else if(score>600 && score<=700) 
			eligibility="Maybe eligible";
		else if(score>700 && score<=800) 
			eligibility="Eligible";
		else if(score>800) 
			eligibility="Definetely eligible";
		
		
		
		 System.out.println("The eligibility is "+ eligibility);
		}else 
			System.out.println("the eligibility is unknown");
		 
		}
	}	


