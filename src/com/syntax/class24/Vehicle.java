package com.syntax.class24;

public  abstract class Vehicle {
	public void drive() {
		System.out.println("Vehicle drives");
	}
	void stop() {
		System.out.println("Vehicle stops");
	}
	abstract void start();
	abstract void speed();

}
abstract class Araba extends Vehicle{//multi level
	 void speed() {
		 System.out.println("Car can speed up to 180 mph");
		
	}
}
class BMW extends Araba{

	@Override
	void start() {
		System.out.println("BMW starts with voice recognation");
		
	}
}
	
