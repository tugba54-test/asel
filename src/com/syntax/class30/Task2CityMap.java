package com.syntax.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task2CityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a Map from array of cities that will sort keys in alphabetical order.
//		As a key store the name of the city and as a value store the length of the city
//		(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//		If any city name is more than 7 characters remove that city . 
		
		Map<String ,Integer>city=new TreeMap<>();
		city.put("Paris",5);
		city.put("Moscow", 1);
		city.put("Washington Dc", 13);
		city.put("Texas",1);
		city.put("Dallas",5);
		city.put("Houston",9);
		System.out.println(city.size());
		 
		Collection<String>c=city.keySet();
		for(String c1:c) {
			if(c1.length()>7) {
			c.remove(c1);
			System.out.println(c);
			}
		}
		
		System.out.println("Keyset with for advanced loop or each loop");
		Set<String>c1=city.keySet();
		for(String ct:c1) {
			System.out.println("Key "+ct+" value "+city.get(ct));}
		
		
		System.out.println("-------keyset with iterator -----");
		Iterator<String>it=c1.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("Key "+key+" value "+city.get(key));
		}
		
		System.out.println("entry set with each loop");
		Set<Entry<String,Integer>>c2=city.entrySet();
		for(Entry<String,Integer>c3:c2) {
			String key=c3.getKey();
			Integer val=c3.getValue();
			System.out.println(key +" : "+val);
		}
		
		System.out.println("entry set with iterator");
		Iterator<Entry<String,Integer>>it1=c2.iterator();
		while(it1.hasNext()) {
			Entry<String,Integer>it2=it1.next();
			System.out.println("Key "+it2.getKey()+" value "+it2.getValue());
		}
		
		Collection<Integer>val=city.values();
		Iterator<Integer>val1=val.iterator();
		while(val1.hasNext()) {
			System.out.print(val1.next()+" ");
		}

	}

}
