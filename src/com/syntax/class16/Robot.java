package com.syntax.class16;
class Main{
	public void speak(String text){
		System.out.println(text);
	}
	public void help(String a){
		System.out.println(a);
	}
	public void jump(int height) {
		System.out.println("i can jump "+height);
	}
	public void move(String direction,double distance) {
		System.out.println("Moving "+distance+" metres in direction "+direction);
	}
}

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main sam=new Main();
		sam.speak("hi i am sam.");
		sam.help(" i can help you ");
		sam.jump(8);
		sam.move("West",12.2);
		String greeting ="hello there";
		sam.help(greeting);
		int value=14;
		sam.jump(value);
		

	}

}
