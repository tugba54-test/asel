package com.syntax.class34;

public class Task2CheckUserName {
	public static void checkUsername(String name) {
		if(name.length()<5) {
			throw new RuntimeException("your name length is so short");
		}else {
			System.out.println("your name length is good");
		}
	}

	public static void main(String[] args) {
		checkUsername("Ali");
	}

}
