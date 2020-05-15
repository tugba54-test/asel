package Nisan30Map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		TreeMap<String,Person>empMap=new TreeMap<>();
		empMap.put("AB1001", new Person("Jhon","Smith",35,20));
		empMap.put("AB1002", new Person("James","brown",55,30));
		empMap.put("AB1005", new Person("Jane","green",65,40));
		empMap.put("AB1004", new Person("Jimmy","red",80,50));
		empMap.put("AB1003", new Person("Jhon","yellow",40,70));
		
		
		//keySet
		Set<String>keys=empMap.keySet();//****
		
		System.out.println("-----------keyset+enchanced loop-----");
		for(String key:keys) {
			System.out.println("EMPID= "+key);
			empMap.get(key).printUserDetails();
			System.out.println("================");
		}
         System.out.println("------------------");
		System.out.println("--------keyset+Iterator");
		
		Iterator<String>keyIt=keys.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println("EMPID= "+key);
			empMap.get(key).printUserDetails();;
		}
		
		//values
		System.out.println("--------------------------------------");
		System.out.println("----------Calling values with Collection ----------");
		Collection<Person>values=empMap.values();//****
		
		for(Person person:values) {
			person.printUserDetails();
		}
		System.out.println("-----------------------------");
		
		System.out.println("------Collection------values+Iterator-------------");
		Iterator<Person>valit=values.iterator();
		while(valit.hasNext()) {
			valit.next().printUserDetails();
		}
		
		System.out.println("---------------------");
		System.out.println("---------Entry set +enhanced loops------");
		
		//entry----->getKey()      getValue()
		Set<Entry<String,Person>>entry=empMap.entrySet();//*****
		for(Entry<String,Person>enter:entry ) {
			System.out.println("------EmpId= "+enter.getKey());
			enter.getValue().printUserDetails();
		}
		
		System.out.println("----------------");
		System.out.println("-----Entry set+Iterator----");
		Iterator<Entry<String,Person>>entIt=entry.iterator();
		while(entIt.hasNext()) {
			Entry<String,Person>it=entIt.next();
			//String key=entIt.next().getKey();
			System.out.println("------EmpId= "+it.getKey());
			it.getValue().printUserDetails();
			
			
		}
		
		
		
	}

}
