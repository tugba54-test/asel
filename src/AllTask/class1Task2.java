package AllTask;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class class1Task2 {

	public static void main(String[] args) {
		
		//Create Java program and name it Variables 
				//a0 In your program create different type of variables to store
				//student's information and then print value of those variables
				//name,lastname,grade,city,state,PhoneNumber
				//change student"s city,state,phone number and grade.
				//adnd print those updates values
				
		
	    Map<Object,Object>map=new TreeMap<>();
		map.put("name", "Tugba");
		map.put("lastName", "Akca");
		map.put("grade", 100);
		map.put("city", "Boston");
		map.put("state", "MA");
		map.put("phoneNumber", 1234567890);
		
		System.out.println("-----Key Set+Iterator----");
		
		Iterator<Object>mapkey=map.keySet().iterator();
		while( mapkey.hasNext()) {
			Object key=mapkey.next();
			System.out.print(key+" value "+map.get(key)+"    ");
		}System.out.println();
		
			
		
		System.out.println("--------Entry Set+Iterator-----");
		Set<Entry<Object, Object>>mapset=map.entrySet();
		Iterator<Entry<Object,Object>>it=mapset.iterator();
		while(it.hasNext()) {
			Object ite=it.next();
			System.out.print(ite+"     ");
		}System.out.println();
		
		
	}

}
