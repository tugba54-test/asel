package com.syntax.class26;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		//non generic
		  	  ArrayList<Object>num=new ArrayList<>();
		  	  num.add(4);
		  	  num.add("Kubra");
		  	  num.add(0.87);
		  	  num.add('l');
		  	  num.add('l');
		  	  for(Object numbers:num){
		  	    System.out.print(numbers+" ");
		  	  }System.out.println();
		  	  for(int i=num.size()-1;i>=0;i--) {
		  		  System.out.print(num.get(i)+" ");
		  		  
		  		  
		  	  }


		}}

	

