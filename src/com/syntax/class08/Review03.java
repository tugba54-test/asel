package com.syntax.class08;

import java.util.Scanner;

public class Review03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=0;
		int sum=0;
		int total=0;
		System.out.println("enter a number to stop enter _1");
		num=input.nextInt();
		while(num!=-1) {
			sum+=num;
			System.out.println("enter a number to stop enter _1");
			num=input.nextInt();
		}System.out.println("the total is "+sum);
		 do { System.out.println("enter a number.to stop -1");
			/*if(number==-1) {
				break;
			}else {
				sum+=number;
			}*/
		 //b way for if
		 if(num!=-1) {
		 total+=num;
		 }	 
	}while(num!=-1);		 
		System.out.println("the total is "+total);
}	
			
}			
	

	


