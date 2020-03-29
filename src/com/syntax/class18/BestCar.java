package com.syntax.class18;

public class BestCar {
	String make,model,color;
	int year,door,wheels;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+"  "+model+" in "+color+" color");
		System.out.println(make+" has "+door+" doors and  "+wheels+" wheels");
	}
	BestCar(String carmake,String carModel,String carcolor,int caryear,int cardoor,int carWheels){
		make=carmake;
		model=carModel;
		color=carcolor;
		year=caryear;
		door=cardoor;
		wheels=carWheels;
	}

	public static void main(String[] args) {
		// once we create our own constructor compiler will not be creating a default constructor for you!
		 BestCar car= new  BestCar("Toyota","Corolla","black",2020,4,4);
		car.make="Toyota";
		car.printDetails();
		
		 BestCar car1=new  BestCar("Bmw", "m5", "grey", 2020,4, 5);
		 car1.printDetails();
		 BestCar car2=new  BestCar("hyundai","sedan","red",2019,4,5);
		car2.printDetails();

	}

}
