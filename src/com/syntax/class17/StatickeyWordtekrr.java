package com.syntax.class17;

public class StatickeyWordtekrr {
	//create a template for a phone
	String color;
	int memory;
	static String brand;
	static boolean touchscreen;
	
	 //return type,name,parameters
	static void displaygeneralinfo() {
		System.out.println("We are building  "+brand+" with touch screen= "+touchscreen);
	
	}
	//instance members of the class can access All static members
	void displaySpecifications() {
		System.out.println("We build phone with "+memory+" GB memoryin "+color+" color");
	}

	public static void main(String[] args) {
		brand="Iphone";
		touchscreen=true;
		StatickeyWordtekrr obj=new StatickeyWordtekrr();
		obj.color="grey";
		obj.memory=64;
		
		//accessing static method in a static way
		displaygeneralinfo();
		
		//accessing not static method in s way
		obj.displaySpecifications();
	

	}

}
