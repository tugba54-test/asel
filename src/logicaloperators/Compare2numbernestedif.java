package logicaloperators;

import java.util.Scanner;

public class Compare2numbernestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("please enter three numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int largest = 0;
		
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}	
			
		}else {
			if(num2>num3) {
				largest=num2;
			}
			System.out.println("largest number is "+ largest);
		}
	}
}	
	
			
		
		
		
	
		
	

	


