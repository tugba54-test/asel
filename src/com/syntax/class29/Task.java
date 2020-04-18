package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
class student{
	Str
	student(String name,int num) {
		
	}
}
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>country=new TreeSet<>();
		country.add("Turkiye");
		country.add("Russia");
		country.add("Azerbeycan");
		country.add("USA");
		country.add("Germany");
         country.add("France");
         System.out.println(country);
         
         Set<String>country1=new HashSet<>(country);
System.out.println(country1);

Set<String>city=new LinkedHashSet<>();
city.add("Ankara");
city.add("Antalya");
city.add("Adana");
city.add("Antakya");
city.add("Austin");
city.add("Houston");
city.add("Albuquerque");

//for(String c:city) {
//	if(c.start))



Iterator<String>c=city.iterator();
while(c.hasNext()) {

if(c.next().startsWith("A")) {
	c.remove();}

	
}
System.out.println(city);

Set<Object>stdnt=new HashSet<>();
stdnt.add("ayse 1234");
stdnt.add("Adile 1534");
stdnt.add("Ahmet 1284");
stdnt.add("Kubra 934");
System.out.println(stdnt);



}
	}


