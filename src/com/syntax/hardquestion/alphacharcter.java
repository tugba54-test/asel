package com.syntax.hardquestion;

public class alphacharcter {

	public static void main(String[] args) {
		// Create a String that will hold a sentence.
//		Write a program to get a new String without any spaces.
		String name="ay cok skldm 5757686%^&*((";
		name=name.replaceAll("[^A-Za-z]", "");
		System.out.println(name);
		name=name.replaceAll(" ","");
		System.out.println(name);

		System.out.println(name.length());
		
//      Create a String that should be combination of letters,
//		numbers and special characters.
//		Find out how many alpha characters are there in the String.
		

	}

}
