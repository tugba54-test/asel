package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>mp=new LinkedHashMap();
		mp.put(123,"ahmet haciosman");
		mp.put(124, "yunus Yakut");
		mp.put(125, "Kubra Akca");
		mp.put(126, "Faisal Sakhi");
		
		System.out.println(mp);
		
		//store objects in aform of Key and Value and you want to sort yor keys is 
		//Ascending order(sayilara gore ayarladi kucukten buyuge dogru)
		Map<Integer,String>tmap=new TreeMap<>();
		tmap.putAll(mp);
		System.out.println(tmap);
		
		Map<String,Integer>population=new TreeMap<>();
		population.put("USA", 33000000);
		population.put("Kazakhstan", 18000000);
		population.put("India", 1326000000);
		population.put("Afghanistan", 37000000);
		
 System.out.println(population);
		
	}

}
