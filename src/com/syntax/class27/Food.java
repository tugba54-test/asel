package com.syntax.class27;

public abstract class Food {
	String name;
	Food(String name){
		this.name=name;
	}
	abstract void boil(); 
	abstract void cook(); 
	abstract void grill(); 

}
class Makarna extends Food{
Makarna (String name){
		super(name);
}
	@Override
	void boil() {
System.out.println("you can boiled "+name);		
	}

	@Override
	void cook() {
System.out.println("you can saute the "+name);		
	}

	@Override
	void grill() {
		System.out.println("you can not grill "+name);
	}
}
class Adanakebp extends Food{

	Adanakebp(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void boil() {
		System.out.println("you can not boil "+name);		

		
	}

	@Override
	void cook() {
		System.out.println("you can cook  "+name);		

		
	}

	@Override
	void grill() {
		System.out.println("you can grill "+name);		

		
	}
	
}
class Pilav extends Food{

	Pilav(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void boil() {
		System.out.println("you can boiled "+name);		
		
	}

	@Override
	void cook() {
		System.out.println("you can saute "+name);		
		
	}

	@Override
	void grill() {
			System.out.println("you can not grill "+name);		

		
	}
	
}