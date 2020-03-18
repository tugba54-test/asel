package com.syntax.class04;

import java.util.Scanner;

public class Replymi {
	/*
	 * For you to do: Ask the user to enter their age "Please enter your age" and
	 * his/her gender "Please enter your gender: M or F"
	 * 
	 * You have 2 conditions: If age is above 25, then check if a user entered F
	 * then the output should be "Woman" otherwise it should say "Man" If age is
	 * below 25, then check if a user entered F then the output should be "Girl"
	 * otherwise it should say "Boy"
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your age");
		int age = input.nextInt();
		if (age > 25) {
			System.out.println("please enter your gender");
			String gender = input.next();
			if (gender.equalsIgnoreCase("F")) {
				System.out.println("woman");

			} else {
				System.out.println("men");
			}
		} else {

			System.out.println("please enter your gender:M or F");
			String gender = input.next();
			if (gender.equalsIgnoreCase("F")) {
				System.out.println("Girl");
			} else {
				System.out.println("Boy");
			}
		}
	}
}
