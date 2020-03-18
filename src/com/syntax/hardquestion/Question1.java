package com.syntax.hardquestion;

import java.util.Scanner;

public class Question1{
	 public static void main(String[] args) {
		// The variable "num" holds an integer input from a user
//			Write a conditional statement starting on line 9 that does the following:
//			If num is positive, print "__ is positive"
//			If num is negative, print "__ is negative"
//			If num is equals to 0, then print "Entered number is equals to 0"
	//
//			Examples:
//			In: 5
//			5 is positive
//			In: -2
//			-2 is negative
//			In: 0
//			Entered number is equals to 0
		Scanner input=new Scanner(System.in);
		 int num;
		 
		 //System.out.println("please enter any number");
		// num=input.nextInt();
		 //if (num>0) {
		//	 System.out.println( num + " is positive");
		// }else if(num<0) {
		//	 System.out.println(num +" is negative");
		// }else {
		//	 System.out.println(num+" is equals to 0");
		 //
		 /*do {
			 System.out.println("please enter any number");
			 num=input.nextInt();
			 if (num>0) {
				 System.out.println( num + " is positive");
			 }else if(num<0) {
				 System.out.println(num +" is negative");
			 }
			 }while(num!=0);
				 System.out.println(num+" is equals to 0");*/
		   for(int i = 0; i <= 5; i++ )
	        {
	            System.out.println("i = " + i );
	        }
		   int k=3, tot=0;

		   do{

		      tot=tot+k;

		      k++;

		   } while(k<11);

		   System.out.print(tot);
	

		   int x=1;

		   do{

		      x++;

		      System.out.println(x);

		   }while(x<5);
		   int z=2, sum=0;

		   while(z<9) {

		      z++;

		      sum=sum+z;

		   }

		   System.out.println(sum);
		   int m=2, total=0;

		   while(m<6) {

		      total=total+m;

		      m++;

		   }

		   System.out.print(total);
		   
		 
	  
		 
	 }
} 
 