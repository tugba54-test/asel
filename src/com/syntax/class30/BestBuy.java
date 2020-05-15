package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>best=new TreeMap();
		best.put(123,"Printer");
		best.put(345, "Tablet");
		best.put(178,"Phone");
		best.put(194,"TV");
		best.put(138,"Sound");
System.out.println(best+" ");

Set<Entry<Integer,String>>buy=best.entrySet();
System.out.print(buy+" ");
System.out.println();
Iterator<Entry<Integer, String>>it=buy.iterator();
while(it.hasNext()) {
	Entry<Integer,String>e=it.next();
	String keyval=e.getKey()+":::"+e.getValue();
	System.out.print(keyval+" ");}
System.out.println();
for(Entry<Integer,String>entr:buy) {
	Integer	key=entr.getKey();
	String val=entr.getValue();
	System.out.print(key+" "+val);
}	
		
	}}

		
		
		
		
		

	


