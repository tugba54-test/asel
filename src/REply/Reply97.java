package REply;

import java.util.Scanner;

public class Reply97 {

	public static void main(String[] args) {
		// Write code that will take in a String input and check to see if it is a
		// palindrome or not.

//A palindrome means that the characters are the same 
//forwards and backwards, ignoring spaces.
//
//Examples of palindromes:
//racecar
//was it a car or a cat I saw
//never odd or even
//rats live on no evil star
//
//Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
//
//Your program will print out "true" if it's a palindrome and "false" if not.
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		String reversed="";
		for(int i=(givenString.length()-1);i>=0;i++) 
			reversed=reversed+givenString.charAt(i);
			
		
		if (givenString.equalsIgnoreCase(reversed)) 
	         System.out.println("true");
	     

		
		else   
	         System.out.println("false");
		
}
}	


