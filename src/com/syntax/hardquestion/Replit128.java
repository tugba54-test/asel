package com.syntax.hardquestion;

public class Replit128 {
	static int countVowels(String ab) {
		int length=0;
		ab= ab.replaceAll("[^aA,eE,iI,oO,uU]", "");
			length=ab.length(); 
			return length;
		}

	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}

	


