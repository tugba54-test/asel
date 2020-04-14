package com.syntax.class24;

abstract class phone {//non access modifier
	void call() {//what is abstacrt why do we need it ,constructor null
		System.out.println("phone can call");
	}
	void text() {
		System.out.println("phone can text");
	}
	abstract void takePicture();
	abstract void playMusic();
}

public class Iphone extends phone  {
	String make;
	Iphone(String make){
		this.make=make;
	}
	void drive() {
		System.out.println("Car can drive");
	}
	void stop() {
		System.out.println("Car can stop");
	}
	@Override
	void takePicture() {
		System.out.println("iphone can take a picture ");
		
	}
	@Override
	void playMusic() {
		System.out.println("iphone can play music");
		
	}

}
class Samsung extends phone  {
	String make;
	Samsung(String make){
		this.make=make;
	}
	void drive() {
		System.out.println("Car can drive");
	}
	void stop() {
		System.out.println("Car can stop");
	}
	@Override
	void takePicture() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void playMusic() {
		// TODO Auto-generated method stub
		
	}
	

}
