package com.syntax.class13;

public class reversequestion {

	// reversed String character by character
	String given="i love java";
	String reversed;

	for(int i=given.length()-1; i>=0; i--) {
		reversed=reversed+given.charAt(i);
	
	
		
	}System.out.println("Reversed String = "+reversed);
	
   //word by word
	String[] array=given.split(" ");
	String reverseWords="";

	for(int i1=array.length-1; i1>=0; i1--) {
		reverseWords=reverseWords+array[i1]+" ";
	}

	System.out.println("Reversed String word by word= "+reverseWords);
}
}


