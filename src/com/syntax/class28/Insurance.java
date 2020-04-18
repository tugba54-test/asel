package com.syntax.class28;
//Create a class Insurance that will have an attribute as 
//insuranceName and unimplemented behaviour as getQuote and 
//cancelInsurance. Create 3 subclasses Car, Pet, Health.
//Car class has it’s own attribute as carModel and Class Pet 
//has petType attribute. Create 3 objects of the sub classes and 
//store them in ArrayList. Using for loop/advanced for loop/ 
//iterator access all methods of the class.
public abstract class Insurance {
String name;
	Insurance(String name){
		this.name=name;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
 class Car extends Insurance{
Car(String name) {
		super(name);}
	
@Override
	public void getQuote() {
System.out.println("you can get a Quote "+name);		
	}
@Override
	public void cancelInsurance() {
		System.out.println("you can cancel Insurance "+name);		
		}}
 class Pet extends Insurance{
Pet(String name) {
		super(name);}
	
@Override
	public void getQuote() {
		System.out.println("you can get a Quote "+name);		
		}
@Override
	public void cancelInsurance() {
		System.out.println("you can cancel Insurance "+name);		
		
	}}
class Health extends Insurance{
Health(String name) {
		super(name);
	}
@Override
	public void getQuote() {
		System.out.println("you can get a Quote "+name);		
		}
@Override
	public void cancelInsurance() {
		System.out.println("you can cancel Insurance "+name);		
		}}
	

