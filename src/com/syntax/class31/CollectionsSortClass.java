package com.syntax.class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
class StringLengthComparator implements Comparator<String>{
public int compare(String a1,String a2) {
	return 0;
	
}
}
public class CollectionsSortClass {

	public static void main(String[] args) {
		Set<String>animal=new LinkedHashSet<>();
		animal.add("elephant");
		animal.add("Goril");

		animal.add("Zebra");

		animal.add("Bird");

		animal.add("lion");
		//Collections.sort(animal);
		for(String animals:animal) {
			System.out.println(animals);
		}
		
		List<Integer>number=new ArrayList<>();
        number.add(123);
        number.add(9);
        number.add(345);
        number.add(876);
        number.add(3);
        
        Collections.sort(number);

	}

}
