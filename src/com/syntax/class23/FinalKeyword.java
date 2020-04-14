package com.syntax.class23;

public class FinalKeyword {
	static String str="Hello";
	public static final String str1="Byte";//final variable=constant(unchangable)
	final static String APPLICATION_URL="https://syntaxtechs.com";
	public static final char GRADE='A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		str="hi";
		//str1="good bye";CE you can not change because final
		System.out.println(APPLICATION_URL);

	}
	public final void hello() {
		System.out.println("i am a final method");
	}
	public final void hello(String name) {
		System.out.println("Hello "+name);
	}
}
class Subclass extends FinalKeyword{
//	public final void hello() {----this method is completed line 15 you have 
//		CE :cannot override final method    }
	public void hello(int a) {
		System.out.println("hello of child class");
	}
}		
	
