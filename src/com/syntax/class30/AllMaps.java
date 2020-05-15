package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		// lets create a grocery map[item,quantity]
Map<String,Integer>grocery=new HashMap<>();
grocery.put("milk", 1);
grocery.put("cucumber", 3);
grocery.put("banana", 12);
grocery.put("cheese", 2);
grocery.put("grapes", 3);
System.out.println(grocery);

//create a map of items to buy in which we want save the order

Map<String,Integer>household=new LinkedHashMap<>();
household.put("lysol", 2);
household.put("sanitizer", 2);
household.put("paper towel", 3);
household.put("toilet paper", 10);
household.put("face mask", 50);
System.out.println(household);

//create a map in which we store all previous items in ascending order
Map<String,Integer>shopping=new TreeMap<>();
shopping.putAll(household);
shopping.putAll(grocery);
System.out.println(shopping);
 
//get All keys
Set<String>keys=shopping.keySet();
System.out.println(shopping.keySet());


//get all keysnusing loop--we can not using regular loop
for(String key:shopping.keySet()) {
	System.out.print(key+" ");
}
System.out.println();
//get all keys using iterator
Iterator<String>it= shopping.keySet().iterator();//method chaining
while(it.hasNext()) {
	System.out.print(it.next());
}System.out.println();
// get all values 
for(int val:shopping.values()) {
	System.out.println("Values "+val);
}
//get all values using iterator
Iterator<Integer>it1=shopping.values().iterator();
while(it1.hasNext()) {
	System.out.print(it1.next()+" ");
}
	}

}
