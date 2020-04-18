package com.syntax.class17;

public class StaticKeyword {
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen= "+touchScreen);
	}
	void displaySpecifications() {
		System.out.println("We build "+brand+" with "+memory+" gb memory in "+color+ "Color");
	}
   //STATIC METHODS CANNOT ACCESS NON-STATIC MEMBERS OF THE
    //static void displaySpecifications1{

	public static void main(String[] args) {
		//accessing static variables in a static way
				brand="iPhone";
				touchScreen=true;
				
				//accessing instance variables through the instance of the class
				StaticKeyword obj=new StaticKeyword();
				obj.color="grey";
				obj.memory=64;
				
				//accessing static method in a static way
				displayGeneralInfo();
				
				//accessing static method in non static way/through instance
				obj.displayGeneralInfo();//valid but not preferable
				obj.displaySpecifications();
			}

	}

