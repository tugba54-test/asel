package com.syntax.class16;

public class Shelter {

	public static void main(String[] args) {
		// access instance variables
		Dog pupy=new Dog();
		pupy.name="Charly";
		
		//access static variables different class
		System.out.println(Dog.breed+"  "+Dog.paws);

	}

}
