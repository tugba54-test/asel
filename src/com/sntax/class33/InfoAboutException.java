package com.sntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str="Hello";
		try {
			char character=str.charAt(10);
			System.out.println(character);
		}catch (StringIndexOutOfBoundsException se) {
			//to get info about the exception
			//se.printStackTrace();
			//System.out.println(se);
			System.out.println(se.getMessage());//user friendly
			
		}
		System.out.println("--------end of the program---");
	}

}
