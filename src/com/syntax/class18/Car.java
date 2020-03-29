package com.syntax.class18;

public class Car {
	String make,model,color;//instance variable----if we are not assign default variable
	int year;
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+ " color");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car =new Car();
		car.make="BMW";
		car.model="m5";
		car.year=2020;
		car.color="black";
		
		car.printDetails();
		Car car1=new Car();
		//we are using instance variable without assigning any value
		//constructor initializes all instance variable and assign default values to them
		System.out.println(car1.make);//if it is not assign default value(initialize object)
		
//		int doors;
//		System.out.println(doors);Ce:local variables must be initialized
		

	}

}
