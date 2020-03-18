package logicaloperators;

import java.util.Scanner;

public class Logicalnot {

	public static void main(String[] args) {
		/* ask a user for how much sales are
		 * based on the amount of sales we need to calculate commission
		 * if commission is between 1-100---->should be 10%
		 * 100nd 200 -------------------------->should be 20%
		 * 200 and 500 ------------------------>should be 30%
		 * if sales more 500------------------->should be 50%
		 */
		// 1.declare all variables that i will need
		Scanner input=new Scanner(System.in);
		double sales;
		double commission;
		
	
		System.out.println("please enter your sales amount");
		sales=input.nextDouble();
		if (sales>=1 && sales<=100) {
			// give user 10% commision
			commission=sales*0.10 ;
		    }else if(sales>100 && sales<=200) {
		    	commission=sales*0.20;
				
			}else if(sales>200 && sales<=500) {
				commission=sales*0.30;
			}else {
				commission=sales*0.50;
			}
			System.out.println("based on your sales you commission is ="+ commission);
			if (commission>100) {
				System.out.println("you are an awesome seller ");
			}
		}
				 

	}


