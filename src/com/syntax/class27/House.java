package com.syntax.class27;

public abstract class House {
	abstract void garden();
	abstract void bedroom();
	abstract void kitchen();
	

}
class DubleX extends House{

	@Override
	void garden() {
System.out.println("Garden needs to be flat ");		
	}

	@Override
	void bedroom() {
System.out.println("Bedroom must be wide");		
	}

	@Override
	void kitchen() {
System.out.println("kitchen needs to be wide ");		
	}
	
}
class Triblex extends House{

	@Override
	void garden() {
System.out.println("needs to be big ");		
	}

	@Override
	void bedroom() {
System.out.println("bedroom needs to be clean");		
	}

	@Override
	void kitchen() {
System.out.println(" has a lots of cabinet ");		
	}
	
}