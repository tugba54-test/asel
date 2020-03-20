package com.syntax.class11;

public class Stringquiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String c = "Hello i love java";
		boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		  
		  String obj = "I LIKE JAVA";
          System.out.println(obj.charAt(3));
          
          String word ="abrakadabra";

          String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

          System.out.println(replace);
          
          String str_Sample = "RockStar";
          System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

          
  
		  

	}

}
