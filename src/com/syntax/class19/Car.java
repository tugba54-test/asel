package com.syntax.class19;

public class Car extends Machine  {// car is a child class is a machine inherites all
	//machine is a parent
		
	
	public void wipeWhinshield() {
		System.out.println("Wiping windshield");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	public void showInfo() {
		System.out.println("Car name :"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
