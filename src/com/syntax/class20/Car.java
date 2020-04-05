package com.syntax.class20;

public class Car {
	String make,model;
	public Car() {
		System.out.println("i am parent class constructor");
		
	}
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
	}

	

}
class Mercedes extends Car{
	String smodel;
	Mercedes(){
		//super();compiler add super() by default
		System.out.println("i am a child class constructor");
		
	}
	public Mercedes(String make,String model,String smodel) {
		//super(make,model);
		this.smodel=smodel;
	}
	public void display() {
		System.out.println("I have "+make+" "+model+" "+smodel);
	}
}
