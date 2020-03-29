package com.syntax.class19;

public class ConstructorCall {
	ConstructorCall(){
		System.out.println("I am non argument constructor");
	}
	public ConstructorCall(String str) {
		this();
	}
	 public ConstructorCall(String str,String str1) {
		 this(str);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCall obj= new ConstructorCall("Java","Love");
	}

}
