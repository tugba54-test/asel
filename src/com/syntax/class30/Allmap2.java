package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Allmap2 {

	public static void main(String[] args) {
//item,quantitty
		Map<String,Integer>grocery=new HashMap();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 4);
		grocery.put("grapes", 7);
		grocery.put("chessee", 8);
		
		System.out.println(grocery);
		
		//create a map of items to buy in which want save the order
		Map<String,Integer>household=new LinkedHashMap();
		household.put("lysol", 2);
		household.put("sanitizer", 3);
		household.put("paper towel", 4);
		household.put("mask", 5);
		household.put("toilet paper", 12);
		
		//create a map in which we store all previous items in ascending order
		Map<String,Integer>shopping=new TreeMap(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys
		for(String getkey:shopping.keySet()) {
			System.out.print("key "+getkey+" ");
		}
		//get all keys using iterator
		Iterator<String>getkey1=shopping.keySet().iterator();//method chainning
        while(getkey1.hasNext()) {
        	System.out.println("getting key with iterator "+getkey1.next());
        }
        
        // get all values
        for(int val:shopping.values()) {
        	System.out.println("getting all the values advanced loops "+val);
        	
        }
        Iterator<Integer>getval=shopping.values().iterator();
        while(getval.hasNext()) {
        	System.out.println("getting values "+getval.next());
        }
		

	}

}
