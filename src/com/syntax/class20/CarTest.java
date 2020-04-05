package com.syntax.class20;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new Car();
		System.out.println("------------>");
		Mercedes mrc=new Mercedes("Mercedes","M","AMG");
		mrc.display();
		//mrc.make="Mercedes";
		Mercedes mrc1=new Mercedes("Mercedes","S", "No AMG");
		mrc1.display();
		Mercedes mrc3=new Mercedes();
		mrc3.display();

	}

}
