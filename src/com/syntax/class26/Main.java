package com.syntax.class26;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>str=new ArrayList<>();
		  str.add("Syntax");
		  if(str.isEmpty()) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
			  
		  }
			ArrayList<Integer>numbers=new ArrayList<>(); 
			numbers.add(111);
			numbers.add(222);
			numbers.add(333);
			numbers.add(444);
			numbers.add(555);
			numbers.add(666);
	for(int i=0;i<numbers.size();i+=2){
	  			System.out.println(numbers.get(i));

	}
	
	  	  ArrayList<Integer>num=new ArrayList<>();
	  	  num.add(4);
	  	  num.add(62);
	  	  num.add(8);
	  	  num.add(5);
	  	  num.add(4);
	  	  for(Integer numbers1:num){
	  	    System.out.print(numbers1+" ");
	  	  }
	  	  


	}

	}

