package com.syntax.class08;

public class Dowhiledemo {
	public static void main(String[] args) {
		int age=0;
		while(age<11) {
			System.out.println("happy birthday"+age);
			age++;
		}System.out.println("you are grown!you do not need a birthday celebration");
		
		
		
		
		int age2=0;
		do {
			age2++;
			System.out.println("happy birthday! you are "+age2+" years old.");
		}while(age2<10);
		System.out.println("you are grown");
		
		String greeting="hi";
		boolean happy=false;
		while(happy) {
			System.out.println(greeting+"inside while");
		}
		
		do {
			System.out.println(greeting+" inside do while");
		}while(happy);//condition false olsa bile bi defa calisr

}
	
}