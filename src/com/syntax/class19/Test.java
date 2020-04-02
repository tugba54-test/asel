package com.syntax.class19;

public class Test {

	public static void main(String[] args) {
		// access variable from own  class
		Dog obj=new Dog();
		obj.breed="Husky";
		//access variables from parent class
		obj.color="grey";
		obj.fur="too much";
		obj.size="big";
		obj.age=5;
		
		//access method from own class
		obj.bark();
		//access methods from parent class
		obj.beWild();
		obj.eat();
		obj.sleep();

		
		Animals animal=new Animals();
		animal.color="white";
		animal.size="small";
		animal.fur="lots of";
		animal.age=2;
		
		animal.beWild();
		animal.eat();
		animal.sleep();
		
		Cat cat=new Cat();
		cat.color="white";
		cat.size="small";
		cat.fur="lots of";
		cat.bigEys=false;
		
		cat.beWild();
		cat.eat();
		cat.sleep();
		cat.play();
		cat.age=3;
	}

}
