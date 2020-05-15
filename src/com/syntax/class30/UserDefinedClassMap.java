package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	String type, name;

	Store(String type, String name) {
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("This is store" + name);
	}

	public abstract void workingHours();
}

class Nike extends Store {

	Nike(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workingHours() {
		System.out.println(name + "works from 10 am till 6pm");
	}

}

class Costco extends Store {

	Costco(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 8 am untill 8 pm");
	}

}

class Amazon extends Store {

	Amazon(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works 7/24");
	}

}

public class UserDefinedClassMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Store> strmap = new LinkedHashMap<>();
		strmap.put(1, new Amazon("online", "Amazon"));
		strmap.put(2, new Costco("whole sale", "Costco"));
		strmap.put(3, new Nike("retail", "Nike"));

		
		

		Iterator<Entry<Integer, Store>> str = strmap.entrySet().iterator();
		while (str.hasNext()) {
			Entry<Integer, Store> e = str.next();
			Integer key1 = e.getKey();
			Store val1 = e.getValue();
			val1.display();
			val1.workingHours();
		}
		Set<Entry<Integer, Store>> strSet = ((Map<Integer, Store>) str).entrySet();
		for(Entry<Integer,Store>entry:strSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			entry.getValue();
		}

	}

	

}
