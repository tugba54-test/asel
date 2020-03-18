package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----substring() FUNCTION-----");
		String str="Today is a rainy day";
		
		String partialstr=str.substring(6);
		System.out.println(partialstr);
		
		// rainy day
	    partialstr=str.substring(11);
		System.out.println(partialstr);
		
		//Today
		
	    partialstr=str.substring(0,5);// start from 0 end at index5
		System.out.println(partialstr);
		
		//rainy
		 partialstr=str.substring(11,16);
		System.out.println(partialstr);

	}

}
