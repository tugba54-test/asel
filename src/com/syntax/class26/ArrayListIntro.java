package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
// create an arrayList to store numbers
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
        numbers.add(10);
		numbers.add(30);
		for(int i=0;i<numbers.size();i++) {
			int num=numbers.get(i);
			System.out.println(num);
		}
System.out.println("------------------------------");
for(int num:numbers) {
	System.out.println(num);
}
//numbers.remove(0);
//numbers.remove(1);
//numbers.remove(2);
//  	   System.out.println(numbers);

for(int i=0;i<numbers.size();i++){
	  numbers.remove(i);
	  System.out.println(numbers);
	}
ArrayList<Integer> list = new ArrayList<>();
list.add(111);
list.add(222);
 list.add(333);
 list.add(444);
 list.add(555);
 list.add(666);
 System.out.println(list);   
list.clear();
 ArraySystem.out.println(list);


}}
