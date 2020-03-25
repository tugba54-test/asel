package com.syntax.class15;

public class Methods {

	public static void main(String[] args) {
	 Methods greet=new Methods();
	 greet.sayWelcome();

	}
	void sayWelcome() {
		for(int i=0; i<10;i++) {
			System.out.println("Welcome"+i);
		}
	}
	void sayAnything( String word,int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(word);
		}
	}
	//create a method is it raining
	//that will accept boolean value as a param
	// and based on the value it will print message accordingly
	void isItRaining(boolean isRain) {
		if(isRain) {System.out.println("it is raining stay home and learn java" );
	}else {
		System.out.println("it is not raining go for a walk");
	}

}
}