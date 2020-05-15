package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeNmber {

	public static void main(String[] args) {
		// Create a Linked List that will store Integer Objects from 50-100.
		//Once Linked List is created remove all numbers that are not divisible by 3.
		LinkedList<Integer>num=new LinkedList<>();
		for(int i=50;i<100;i++) {
			num.add(i);
		}
		
		Iterator<Integer>n=num.iterator();
		while(n.hasNext()) {
			if(n.next()%3!=0) {
				n.remove();
			}
		}
System.out.println(num);
	}

}
