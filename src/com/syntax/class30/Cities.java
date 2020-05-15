package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cities {

	public static void main(String[] args) {
		// Create a Map from array of cities that will sort keys in alphabetical order. 
//		As a key store the name of the city and as a value store the length of the city 
//		(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//		If any city name is more than 7 characters remove that city . 
		
		Map<String,Integer>city=new TreeMap();
		city.put("Paris", 5);
		city.put("Ankara", 6);
		city.put("Ashgabat", 8);
		city.put("Istanbul", 7);
		city.put("Garland", 9);
		city.put("Arlington", 5);
		System.out.println(city);
		
		Set<Entry<String,Integer>>entry=city.entrySet();
		Iterator<Entry<String,Integer>>it=entry.iterator();
		
		while(it.hasNext()){
			Entry<String,Integer>k=it.next();
			if(k.getKey().length()>7) {
				it.remove();
			}
			
		}System.out.println(city);
		
		
		
			
				
			
			
			
		}

	}


