package task;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		Scanner alt=new Scanner(System.in);
		System.out.println("please enter your loan");
		int loan=alt.nextInt();
		if(loan<200000) {
		System.out.println("You would lend the money");
		}else { 
			System.out.println("you are rejected");
		}
}
}



	


	
