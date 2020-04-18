package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,String>hmap=new HashMap<>();
       hmap.put("name", "Jhon");
       hmap.put("Lastname","Smith");
       hmap.put("Adress","123 Test");
       hmap.put("City","Chantilly");
       
       //how to check if map has any values
       System.out.println(hmap.isEmpty());
       
       // how many element is Map
       System.out.println(hmap.size());
       
       //can we add more values into map
       hmap.put("zipcode","123");
       System.out.println(hmap);
       
       //can we store duplicate keys?no,previous value will be replaced
       hmap.put("name", "jane");
       System.out.println(hmap);
       
       //how access the value?-.use method get and specify the key
       System.out.println(hmap.get("name"));
       
       //how can we remove element at Map
       hmap.remove("Adress");
       System.out.println(hmap);
       
	}

}
