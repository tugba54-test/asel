package com.syntax.class12;

public class Slitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String today="Today is my favorite Java Class";
		String []array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]+"10");
		System.out.println(array[1]);
		String today1="Today is my favorite Java class";
		
		String[]stringArray=today1.split("a");
		//print all elements from array 1 by 1
		//element type variable name:name of array
		for(String   arr      :stringArray) {
			System.out.println(arr+"|");
			
			// we want to print String word by word 
			String today2="Today is my favorite Java class";
			String[] words=today2.split(" ");
			
			for(int i=0; i<words.length; i++) {
				System.out.println(words[i]);
			}
			System.out.println("------TRIM---->");//sadece bastaki ve sondaki bosluklari kaldiriyr
			String today3="Today is my favoriteJava class";
			
			
			
		}

	}

}
