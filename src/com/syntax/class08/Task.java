package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
			continue;
			}
			System.out.println(i);
		}
		Scanner scan=new Scanner (System.in);
		String yes=null;
		for(int i=1; i<=10; i++) {
			System.out.println("apply for a credit card");
			yes=scan.nextLine();
	      if(yes.contentEquals("yes")){
		System.out.println("congrats ");
			break;
		}

	}
	}
}
