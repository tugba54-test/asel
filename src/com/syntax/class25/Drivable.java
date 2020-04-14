package com.syntax.class25;

public interface Drivable {
	// compiler by default adds static final
	boolean MOVE_FAST=true;
	
	//compiler by default adds public abstract
	  void drive();//you can increase access when you are override 
	// but you can not decrease access
}
abstract class Vehicle{
	 abstract void stop();
}
// achieving multiple inheritance
class Cars  extends Vehicle implements Drivable{// you have to provide implementations interface 

	@Override
	public void drive() {
   System.out.println("Car drives");		
	}

@Override
void stop() {
	System.out.println("car stop");
	
}
	
}

