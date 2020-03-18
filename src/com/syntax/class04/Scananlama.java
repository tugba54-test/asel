package com.syntax.class04;

import java.util.Scanner;

public class Scananlama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("please enter your name");
		String name=scan.nextLine();
		
		System.out.println("my name is"+name);
		System.out.println("how old are you");
		int age=scan.nextInt();
		System.out.println("your name is "+name+" your age is "+age);
		
		
		
		String text=scan.nextLine();
		System.out.println("lutfen text yaziniz");
		System.out.println("lutfen text yaziniz"+text);
		
	


	}

}

