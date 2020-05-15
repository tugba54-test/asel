package May1exception;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IQ9ArrayListDuplicateRemove {

	public static void main(String[] args) {
		// How can we remove all duplicates from ArrayList?
		
		//1. Save ArrayList inside a Set
		// 2. Save ArrayList inside key Values of Maps
		//3. For Loop ile duplication degerleri silebilirz
		
		List<Integer>numList=new ArrayList<>();
		numList.add(12);
		numList.add(15);
		numList.add(14);
		numList.add(12);
		numList.add(12);
		numList.add(17);
		numList.add(23);
		
		// First Way -->SAve Arraylist inside a Set
		//1. while initilazing the set we can copy Arraylist 
		TreeSet<Integer>numSet=new TreeSet<>(numList);
		System.out.println(numSet);
		
		//Second Way we can add all values inside the arrayList with a loop
		
		
		Set<Integer>numSet1=new LinkedHashSet<>();
		for(Integer num:numList) {
			numSet1.add(num);
		}
		System.out.println(numSet1);
		
		Map<Integer,String>numMap=new LinkedHashMap<>();
		for(Integer num:numList) {
			numMap.put(num,null);
		}
		System.out.println(numMap);
		
		Set<Integer>keys=numMap.keySet();
		for(Integer key:keys) {
			System.out.print(key+"  ");
		}
		System.out.println();
		//3. for loop ile duplication degerleri silebilirz
		// sondan basa dogru gidiyrz
		for(int i=numList.size()-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(numList.get(i)==numList.get(j)) {
					numList.remove(j);
				}
			}
			
		}System.out.println(numList);
		
		
	}

}
