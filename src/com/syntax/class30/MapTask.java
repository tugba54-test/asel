package com.syntax.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String>building=new LinkedHashMap();
building.put(1, "Google");
building.put(2, "Syntax");
building.put(3, "Google");
building.put(4, "Amazon");
building.put(5, "Amazon");
building.put(6, "Hp");
building.put(7, "Microsoft");
System.out.println(building.size());
System.out.println(building);
Set<Integer>key=building.keySet();
System.out.println("---getting keys using iterator");
Iterator<Integer>keyit=key.iterator();
while(keyit.hasNext()) {
	int key1=keyit.next();
	System.out.println("key is : "+key1+" value is "+building.get(key1));
}	


System.out.println("----getting keys using for each loop---");
for(int k:key) {
	System.out.println("Key from building map "+k+" value "+building.get(k));
}
	//how to get all values
Collection<String>values=building.values();
System.out.println("---getting all values using for each loop");
	for(String v:values) {
		System.out.println("Value from the collection "+v);
	}
	
	System.out.println("-----getting all values using iterator");
	Iterator<String>vit=values.iterator();
	while(vit.hasNext()) {
		System.out.print(vit.next()+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	








	}

}
