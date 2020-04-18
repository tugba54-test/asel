package com.syntax.class29;

import java.util.HashMap;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentMap=new HashMap<>();
		studentMap.put(101, "John");
		studentMap.put(102, "Jason");
		studentMap.put(103, "Jordan");
		studentMap.put(104, "Jenny");
		//to check if specific key or value exist
		System.out.println(studentMap.containsKey(101));
		System.out.println(studentMap.containsValue("Jordan"));
		System.out.println(studentMap.containsKey(104));
		//to access 1 value
		System.out.println(studentMap.get(102));
		System.out.println(studentMap.get(101));
		//replace value
		studentMap.replace(104, "Nikky");
		System.out.println(studentMap);
		studentMap.replace(102,  "Yasemin");
		System.out.println(studentMap);

		//remove object
		//studentMap.remove(103);
		System.out.println(studentMap);
		//studentMap.remove(102);

		System.out.println(studentMap);
		System.out.println("HasMap de yasemin degeri var mi ? "+studentMap.containsValue("Yasemin"));


	}

}
