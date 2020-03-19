package com.syntax.class13;

public class reversequestion {
	public static void main(String[] args) {
	// character by character
	String given="i love java";
	String reversed="";
	for(int i=given.length()-1; i<=0;i--) {
		reversed+=given.charAt(i);
		
		
	}System.out.print(reversed);
	System.out.println();

}
}
