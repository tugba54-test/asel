package com.syntax.class14;

public class Dog {
	public static void main(String[]args) {
	
	Dog dog1=new Dog();
	dog1.breed="German shephard";
	dog1.color="brown";
	dog1.name="bhaner";
	dog1.age=2;
	
	Dog dog2=new Dog();
	dog2.breed="Husky";
	dog2.color="white";
	dog2.name="lucy";
	dog2.age=3;
	
	dog2.run();
	dog2.makeNoise();
	dog2.stop();
	dog2.eat();
	
	dog1.run();
	dog1.makeNoise();
	dog1.stop();
	dog1.eat();
		

	}
String breed;
String color;
String name;
int age;

void run() {
	System.out.println(" can run");
}
void makeNoise() {
	System.out.println(name+" can make noise");
} void stop(){
	System.out.println(name+" stops when i say it");
	
}
void eat() {
	System.out.println(name+" can eat");
}



}
