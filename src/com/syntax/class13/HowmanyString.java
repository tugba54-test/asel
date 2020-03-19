package com.syntax.class13;

public class HowmanyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ggdhjdsjhhgdhgfwdh$%^&(&^9 hhjk";
	    str=str.replaceAll("[^A-za-z]", "");
	    syso
		int  number=str.length();
		System.out.println("number of alpha character= "+number);
		String mystr="Today is Wednesday";
		String[] array=mystr.split(" ");
		int lent=array.length;
		System.out.println(lent);

	}

}
