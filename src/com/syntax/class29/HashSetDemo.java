package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>brkfst=new HashSet();
		brkfst.add("egg");
		brkfst.add("bread");
		brkfst.add("tea");
		brkfst.add("creamcheese");
		brkfst.add("tea");
		brkfst.add("coffee");
		
		//how many elements in the set
		System.out.println(brkfst.size());
		//order is not maintained
		System.out.println(brkfst);
		
		//we need to retrieve an element
		//no get method available
		
		//advanced for each loop
		for(String b:brkfst) {
			System.out.println(b+" ");
		}
		// we can not use regular for loop 
		//because we do not have get method
		
		Iterator<String>b=brkfst.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}



	}

}
