package logicaloperators;

import java.util.Scanner;

public class Scannerandlogicalimproved {

	public static void main(String[] args) {
		/*Write a program to find the largest number among three distinct numbers using nested if condition
        *Please use Scanner class to take input from users
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 distinct number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int largest;
        
        if(num1>num2) {
         if(num1>num3) {
        	largest=num1;
        }else {
        		largest=num3;
        	}
        }else {
        	largest=num2;
        }
        System.out.println("The largest number is "+largest);
        }
}
        

	


