package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// create an arrarlist with names
		
		ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Fisun");
        arrayList.add("Gulbahar");
        
        //access element from arrayList
       String secondElement= arrayList.get(1);
       System.out.println(secondElement);
       
       
       //arraylist is dynamic array
       arrayList.add("Jane");
       arrayList.add("James");
       		
       //how to get number of elements insude arraylist?
       int size=arrayList.size();
       System.out.println(size);
       arrayList.add("hichem");
       System.out.println(arrayList.size());
       
       arrayList.remove("John");
       System.out.println(arrayList.size());
       
       arrayList.add("Hichem");
       System.out.println(arrayList);
       
       arrayList.set(2,"Faisal");
       System.out.println(arrayList);
       
       //how to retrieve values from arryList 1 by 1?
       for(int i=0; i<arrayList.size();i++) {
    	   System.out.println(arrayList.get(i));
       }
       System.out.println("--------------------------");
       for(String str:arrayList) {
    	   System.out.println(str);
       }
       
       
       
       
	}
	

}
