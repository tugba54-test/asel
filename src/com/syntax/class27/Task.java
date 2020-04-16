package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;


public class Task {

	public static void main(String[] args) {
      ArrayList<String>words=new ArrayList<>();
      words.add("hi");
      words.add("merhaba");
      words.add("hello");
      words.add("bityre");
      Iterator<String>words2=words.iterator();
      while(words2.hasNext()) {
    	  if(words2.next().endsWith("e")) {
    		  words2.remove();
    	  }
      }
      System.out.println(words);
      		
	}

}
