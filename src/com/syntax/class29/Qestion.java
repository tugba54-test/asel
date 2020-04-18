package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Qestion {

	public static void main(String[] args) {
		//how can we remove duplicate variables
		List<String>name=new ArrayList();
		name.add("john");
		name.add("jane");
		name.add("jasmine ");
		name.add("john");
		name.add("jahn");
		name.add("john");
		name.add("jane");
		name.add("james");
		Set<String>name1=new HashSet(name);
		System.out.println(name1);
		name1.add("Alijon");
		name1.add("Usman");
		
		//how to get only 1 value from set?
		if(name1.contains("jasmine")){
			System.out.println("We have Jasmine");
		}
		
		//1 convert to list
		List<String >list=new ArrayList<>(name1);
		System.out.println(name1);
		String n=list.get(4);
		System.out.println(n);
				

	}

}
