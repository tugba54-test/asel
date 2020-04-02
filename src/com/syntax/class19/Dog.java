package com.syntax.class19;

public class Dog extends Animals{//all access of animal class
	String breed;
	public void bark() {
		System.out.println("all dogs can bark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Dog dog1=new Dog();
   dog1.bark();
   dog1.beWild();                       
   
   
   
	}

}
