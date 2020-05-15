package com.syntax.class15;

public class MethodPalndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPalndrome  text=new  MethodPalndrome ();
		 String word="hannah";
		 text.plndrm(word);

	}
	void plndrm(String word) {
		char[] array=word.toCharArray();
		String reverse="";
		for(int i=(word.length())-1;i>=0;i++){
	reverse=reverse+word.charAt(i);
			if(word.equalsIgnoreCase(reverse)) {
				System.out.println(word+" is a palindrome");
			}else {
				System.out.println(word+" is not palindrome");
			}
		}
	
	
	}
	
	

}
