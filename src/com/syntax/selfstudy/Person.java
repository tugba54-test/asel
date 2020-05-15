package com.syntax.selfstudy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Person {
	private String name, salary,lastName;
	private int age;
	Person(String name, String salary, String lastName,int age){
		this.lastName=lastName;
		this.name=name;
		this.salary=salary;
		this.age=age;
		
		
	}
	public void display() {
		System.out.println("name is "+name+" lastname is "+lastName+" age is "+age+" salary is "+salary);
	}

	public static void main(String[] args) {
//		Create a Person class with following private fields: name, lastName, age, salary. 
//		Variables should be initialized through constructor.
//		Inside the class also create a method to print user details.
//		In Test Class create a Map that will store key in ascending order.
//		In that map store personId and a Person Object. Print each object details.
		
		Map<Integer, Person>persn=new TreeMap<>();
		persn.put(10,new Person("Kubra","100.000","Akca",21));
		persn.put(9,new Person("Busra","95.000","Akca",20));
		persn.put(4,new Person("azra","105.00","Begit", 21));
		
		//trying to get all key and value-methods with keySet
		System.out.println("Keyset advanced loops ");
		Set<Integer>allset=persn.keySet();
		
		for(Integer p:allset) {
			System.out.print("key is "+p+" ");
			persn.get(p).display();}
		
			System.out.println("Keyset with iterator");
			Iterator<Integer>it=allset.iterator();
			while(it.hasNext()) {
				int key=it.next();
				System.out.print("Key is "+key+" ");
				persn.get(key).display();
			}
			System.out.println("Collection i kullanarak get all value");
			Collection<Person> values=persn.values();//Iterable=collection
			
			System.out.println("--- getting all values using for each loop ---- ");
			for(Person v:values) {
             v.display();

			}
			Collection<Integer> key1=persn.keySet();
			System.out.println("--- getting all keys using for each loop ---- ");
			for(Integer k:key1) {
				System.out.print(k+" ");
			}
			System.out.println("--------------");
			System.out.println("Using entry set getting key and Value ");
			Set<Entry<Integer,Person>>p1=persn.entrySet();
			for(Entry<Integer, Person> entr:p1) {
				Integer key=entr.getKey();
				Person value=entr.getValue();
				System.out.print(key+" ");
				value.display();}
			
			Iterator<Entry<Integer,Person>>p2=p1.iterator();
			while(p2.hasNext()) {
				Entry<Integer,Person> e= p2.next();
				String result=e.getKey()+" ::";
				System.out.print(result);
				e.getValue().display();
				
			}

			
		}

	}


