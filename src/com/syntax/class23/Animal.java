package com.syntax.class23;

public class Animal {
	public static void whoAmI() {//method hiding static override olmuyr
		System.out.println("i am an animal");
	}
	public void sleep() {
		System.out.println("Animal sleep");
	}

}
class Bird extends Animal{
	//this process calls method hiding
	public static void whoAmI() {
		System.out.println("i am an bird");
	}
	@Override
	public void sleep() {
		System.out.println("Bird sleep");
	}
}//test is webdrivertest sayfasinda
