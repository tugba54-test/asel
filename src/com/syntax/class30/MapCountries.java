package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>country=new TreeMap();
country.put("Turkiye","Ankara");
country.put("France","Paris");
country.put("Texas","Austin");
country.put("Italy","Roma");
System.out.println(country);
for(String c:country.keySet()) {
	System.out.print("getting key with advanced loop "+c);
}
System.out.println();
Iterator<String>it= country.keySet().iterator();//method chaining
while(it.hasNext()) {
	System.out.print(it.next()+" ");
}System.out.println();
Iterator<String>it1=country.values().iterator();
while(it1.hasNext()) {
	System.out.print(it1.next()+" ");
}
	}

}
