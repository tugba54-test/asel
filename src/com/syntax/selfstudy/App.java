package com.syntax.selfstudy;

class Person {

	// instance variables(data or state)
	String name;
	int age;

	// classes can contain
	// 1-data
	// 2- state

	void speak() {
		for(int i=0; i<=3;i++) {
  System.out.println("my name is name is : "+name+" and i am  "+age+" years old");}
	}
	void sayHello() {
		System.out.println("hello there");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("There");
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;

		System.out.println(person1.name + "  " + person1.age);
		System.out.println(person2.name+"    "+person2.age);

	}

}
