package com.syntax.class14;

public class Phone {
  public static void main(String[] args) {
		// cretae an object from phone class
	  //instanciate phone class
	  
	  //new phone();--->create an object of phone
	  //Phone---->variable/reference variable
	  //phone--->type of variable
	  Phone phone1=new Phone();
	   phone1.model="x123";
	   phone1.color="pink";
	   phone1.brand="iphone";
	   
	   Phone phone2=new Phone();
	   phone2.model="x13";
	   phone2.color="black";
	   phone2.brand="samsung";
	   
	   
	   Phone phone3=new Phone();
	   phone3.model="x15";
	   phone3.color="brown";
	   phone3.brand="nokia";
	   System.out.println(phone2.model);
	   
	   phone1.message();
	   phone1.facetime();
	   phone1.app();
	   
	   phone2.message();
	   phone2.facetime();
	   phone2.app();
	   
	   phone3.message();
	   phone3.facetime();
	   phone3.app();
	   
	   String str="Hello friends";
	   str=str.replace("Hello", "welcome");
	   System.out.println(str);
	}
 String model;
 String color;
 String brand;
 
void message() {
	System.out.println("message  can send ");
}
void facetime() {
	System.out.println(brand+"facetime can call");
}
void app() {
	System.out.println(brand+"you can load lots of app");
}
}
