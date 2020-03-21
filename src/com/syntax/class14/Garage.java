package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		Car car1 = new Car();
		car1.make = "Lamborchini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "m5";
		car2.year = 2019;
		car2.color = "pink";

		Car car3 = new Car();
		car3.make = "123";
		car3.speed = 200;
		
//		Car2 anotherCar=new Car();
//		anotherCar.make="toyota";
//		anotherCar.speed=90;
//		another

		// print bmw
		System.out.println(car2.make);
		// accessing behavior/methods of car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();

		// accessing behavior/methods of car2
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		// we cant write car2.break cunku define yapmadk
		// i drive pink bmw
		System.out.println("i drive " + car2.color + " " + car2.make);

		// create

	}

}
