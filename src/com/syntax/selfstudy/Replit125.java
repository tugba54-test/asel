package com.syntax.selfstudy;

public class Replit125 {
	static String mixString(String s1,String s2){
		String firstValue="";
	    String [] value=s1.split("");
	   String[] value2=s2.split("");
	    for(int i=0;i<value.length;i++){
	        firstValue+=value[i]+value2[i];
	      }return firstValue;
	    }
	    static String mixstring(String s1,String s2){
	      String secondValue="";
	      String [] value=s1.split("");
	     String[] value2=s2.split("");
	      for(int i=0;i<value.length;i++){
	        secondValue+=value[i]+value2[i];
	    } return secondValue;
	        
	  }
	  	
	  	public static void main(String[] args){
	  	  String firstValue = mixString("12345","abcde"); 
	  		System.out.println(firstValue); 
	  		String secondValue = mixString("howdy","hello");
	  		System.out.println(secondValue); 
	  	}
	  }
	

   