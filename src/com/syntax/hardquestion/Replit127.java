package com.syntax.hardquestion;

public class Replit127 {


	
		// Create a static method with the following specs:  
//Returns:an integer
//Name:countA
//Parameters:a String called s
//Purpose:count the number of occurrences of 'a' or 'A' within s
//Examples:countA("aaa") ==> 3
//countA("aaBBdf8k3AAadnklA") ==> 6
//Hint: How do you write a
//for loop to loop through every letter of a string?  You've done this multiple times already :)
	public static void main(String[] args) {
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}

		 static int countA(String str) {
			 int count=0;
			String [] ahmet=str.split("");
			for(int i=0;i<ahmet.length;i++) {
				if(ahmet[i].equalsIgnoreCase("a")) {
					count++; 
				}
			}
			return count;
		}
}


