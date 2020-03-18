package com.syntax.class10;

public class Task101 {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals= {"Elephant","Gorilla","Giraffe","Lion",
				"Rabbit","Frog"};
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println();

	for(String animal:animals) {
		System.out.println(animal);
	}
		}
		

	}


