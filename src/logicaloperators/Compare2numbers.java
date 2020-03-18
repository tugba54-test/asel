package logicaloperators;

import java.util.Scanner;

public class Compare2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your first number");
		double num1=scan.nextDouble();
		
		System.out.println("please enetr your second number");
		double num2=scan.nextDouble();
		
		System.out.println("please enetr third number");
		double num3=scan.nextDouble();
		
		double largest = 0;
		
		if(num1>num2 && num1>num3) {
			largest=num1;
		}else if(num2>num1 && num2>num3) {
			largest =num2;
		}else if(num3>num1 && num3>num2) {
			largest=num3;
		}
		System.out.println("largest number is "+largest);
		
		
		

	}

}
