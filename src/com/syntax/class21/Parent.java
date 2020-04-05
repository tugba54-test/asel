package com.syntax.class21;

public class Parent {
	String name="Farid";
	String lastName="Smith";
	void hello() {
		System.out.println("i am a parent class method");
	}

}
class Child extends Parent{
	String name="Ahmet";
	public void display() {
		
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	void Shello() {
		display();// implicitly compiler adds this
		hello();//implicitly compiler adds super
		super.hello();
		
	}
}
