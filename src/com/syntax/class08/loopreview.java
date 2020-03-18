package com.syntax.class08;

import java.util.Scanner;

public class loopreview {

	public static void main(String[] args) {
		// 50 to 1 print
			for(int i=50; i>=1;i--) {
				
				System.out.print(i+" ");
			}System.out.println();
			//PRINTING ODD NUMBERS BETWEEN 20-50
			for(int i=20;i<=50;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}System.out.println();
			}
   int total=2;
   for(int i=1; i<4;i++) {
	   total=total*i;
	   System.out.println(total);
	}System.out.println("Final total= "+total);
	//write a program to calculate sum of odds and sum of odd numbers 1-99
	
	int evens=0;
	int odds=0;
	for(int i=1; i<=99;i++) {
		if(i%2==0) {
			evens=evens+i;
			System.out.println(evens);
		}else {
			odds=odds+i;
			System.out.println(odds);
		}
	}
	System.out.println("sum of even"+evens);
	System.out.println("sum of odd"+odds);

}
}