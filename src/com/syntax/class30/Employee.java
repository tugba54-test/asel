package com.syntax.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {

	public static void main(String[] args) {
		// Create a Map that will store Employee name and salary. 
		//Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
		//John Smith=$100000
		
		Map<String,Integer>emp=new LinkedHashMap();
		emp.put("John Smith",100000 );
		emp.put("Jhane Smith",90000 );
		emp.put("cony Smith",95000 );
		emp.put("Jasmine Smith",80000 );
		emp.put("Jayn Smith",85000 );
		System.out.println(emp);
		
		
	
		
		
		
		
		int max=Collections.max(emp.values());
		
		Collection<Entry<String,Integer>>employee=emp.entrySet();
		Iterator<Entry<String,Integer>>emp1=employee.iterator();
		while(emp1.hasNext()) {
			Entry<String,Integer>emp2=emp1.next();

			if(emp2.getValue()>max) {
				
				max=emp2.getValue();
			}System.out.println(max+emp.get(max));
		}System.out.println(max+emp.get(max));

		
		
		
		
		

	}

}
