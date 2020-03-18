package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		// getting all elements
		char[] grades= {'A','B','C','D','E','F'};
		for(int i =0; i<grades.length;i++) {
			System.out.print(grades[i]+" ");
		}System.out.println();
		
		System.out.println("-----printing using ADVANCED for loop---");
        for(char grade:grades) {
        	System.out.print(grade+" ");
        }System.out.println();
        
        //create an array fruits and retrieve all elements
        //advanced for loop,enchanced for loop, for each loop
        String[] fruits= {"banana","kiwi","orange","apple","mango"};
        for(String fruit:fruits) {
        	if(fruit.contentEquals("apple")) {
        		System.out.println("this is your favorite fruit "+fruit);
        	}else {
        	System.out.println(fruit);
        	}
        }System.out.println("----other loop----");
        //regular for  loop
        for(int i=0; i<fruits.length; i++) {
        	System.out.print(fruits[i]+" ");
        }System.out.println();
        
        System.out.println("====Benim yaptigim ornek-------");
        String[] vegi= {"eggplent","tomato","cucumber","squash"};
        for(String vege:vegi) {
        	if(vege.contentEquals("cucumber")) {
        		System.out.println("this is my favorite vegi "+vege);
        	}else {
        	System.out.print(vege+"  ");
        }System.out.println();
        
	}
	
	System.out.println("-----enchanced for loops");
    for(int i=0;i<vegi.length;i++) {
    	System.out.print(vegi[i]+"     ");
    }System.out.println();
    }
}
