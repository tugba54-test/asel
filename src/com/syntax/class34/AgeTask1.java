package com.syntax.class34;

public class AgeTask1 {

	public static void main(String[] args) {
age(18);


	}
 public static void age(int age) {
	 if(age<16) {
		 throw new ArithmeticException("you are to young to drive");
	 }else {
		 throw new RuntimeException("you can drive");
	 }
 }
}
