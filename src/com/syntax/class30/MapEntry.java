package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> land = new TreeMap();
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tahran");
		land.put("Peru", "Lima");
		land.put("Cuba ", "Havana");
		System.out.println(land);

		// storing all entry objects into e set
		Set<Entry<String, String>> AllEntries = land.entrySet();
		System.out.println(AllEntries);

//loop through all entries to get a key and values
		for (Entry<String, String> entr : AllEntries) {
			String key = entr.getKey();
			String val = entr.getValue();
			System.out.println(key + " " + val);
		}

		// iterate through
		// all entries to get a key and value
		Iterator<Entry<String, String>> it = AllEntries.iterator();
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			String keyval = e.getKey() + ":::" + e.getValue();
			System.out.println(keyval);
		}

	}

}
