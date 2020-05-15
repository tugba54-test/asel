package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>month=new LinkedHashMap();
		month.put("ocak",21);
		month.put("Subat",29);
		month.put("mart",13);
		month.put("nisan",31);
		month.put("mayis",21);
		System.out.println(month.size());
		
		//get all entries from a map
		Set<Entry<String,Integer>>ay=month.entrySet();
		System.out.println(ay);
		System.out.println("Advanced Loops");
		for(Entry ay1:ay) {
			System.out.println(ay1.getKey()+"= "+ay1.getValue()+" ");
		}
		System.out.println("ITerator");
		Iterator<Entry<String,Integer>>it=ay.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>it1=it.next();
			System.out.println(it1.getKey()+"= "+it1.getValue());
		}

	}

}
