package com.syntax.class23;

public class Computer {
	String brand;
	void display(){
		System.out.println("it has some software system");
	}
	void cost() {
		System.out.println(" some of computer is very "
				+ "cheap");
	}


	Computer(String brand) {
		this.brand=brand;

}

}
class Apple extends Computer{
	 Apple(String brand) {
		super(brand);
	 }
	 void display(){
			System.out.println("it has some software  and hardware system");
		}
void cost() {
	System.out.println(brand+ "is very expensive");
}
	
}
class Lenova extends Computer{
	Lenova(String brand) {
		super(brand);
	}
	void cost() {
		System.out.println(brand +" is not so expensive");
	}
	void display(){
		System.out.println("it has some software system and some tools");
	}
}
class HP extends Computer{
	HP(String brand) {
		super(brand);
	}
	void cost() {
		System.out.println("HP is normal price ");
	}
	void display(){
		System.out.println("it has some software system and settings system");
	}
}

class Dell extends Computer{
	Dell(String brand) {
		super(brand);
	}
	void cost() {
		System.out.println("Dell is very cheap");
	}
	void display(){
		System.out.println("it has some software system touch screen");
	}
	
}
