package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>veggi=new HashSet<>();
veggi.add("carrot");
veggi.add("potato");
veggi.add("cucumber");
veggi.add("eggplant");
veggi.add("potato");
veggi.add("carrot");
System.out.println(veggi);

//sirayla yazdiriyr duplicate e izn yok
Set<String>fruits=new LinkedHashSet<>();
fruits.add("apple");
fruits.add("mango");
fruits.add("kiwi");
fruits.add("tomato");
fruits.add("banana");
fruits.add("mango");
fruits.add("tomato");
System.out.println(fruits);

// alfabetical order yapiyr duplicate izn yok 
Set<String>food=new TreeSet<>();//we can add in the parantesis
food.addAll(veggi);
food.addAll(fruits);
System.out.println(food);

	}

}
