package com.syntax.class04;

import java.util.Scanner;

public class Eamplescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter any text");
		String text=scan.nextLine();
		System.out.println(text);
		System.out.println("please enter any number");
		int number=scan.nextInt();
		System.out.println(number);
		
		System.out.println("end of the program");

	}

}
