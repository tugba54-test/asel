package com.syntax.class13;

public class AlpheQ4 {

	public static void main(String[] args) {
		// how many alpha karakter and word
		String str="hidhhasjkasjhjkshjksh    ^&%##^*)_U^%E%$#$#%";
   str=str.replaceAll("[^A-Za-z]","");
   int length=str.length();
   System.out.println("alpha caharcter"+length);
   
   String str1="today is monday weather is nice yayyy";
   String [] array=str1.split(" ");
   int words=array.length;
   System.out.println("word "+words);
		

	}

}
