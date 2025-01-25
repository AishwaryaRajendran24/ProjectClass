package com.eveningbatch.eg;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapExample  {
	public static void main(String[] args) {
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "David");
		map.put(2, "AAA");
		map.put(3, "BBB");
		map.put(4, "CCC");
		map.put(1, "DDD");
		map.put(5, "DDD");
		
		//Put Method
		System.out.println(map);
		//Get Key- It returns corresponding value
		String string = map.get(3);
		System.out.println(string);
		//Values()- it returns all the values
		Collection<String> values = map.values();//It returns Collection<Object>
		System.out.println("Values of Map"+values);
		//keySet()- It returns all the key Set
		Set<Integer> keySet = map.keySet();// It returns a Set
		System.out.println("Key Set"+keySet);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		//for(Return_type reference_variable: iteration_variable)
		for(Entry<Integer, String> x: entrySet) {// ForEach loop (or) Advanced For Loop
			System.out.println("Key Set"+x.getKey());// GetKey method prints only the Keyset
			System.out.println("Value pairs"+x.getValue());// GetValue method prints only the value pairs
		}
		// Map<Key(WrapperClass),value(WrapperClass> ref_variable=new LinkedHashMap<>();
		//LinkedHashMap<Integer,String> ref=new LinkedHashMap<>();//Object creation
		Map<Integer,String> map2=new LinkedHashMap<>();
		//PutAll Method - Copies all the values and Key pairs to another Map
		map2.putAll(map);
		System.out.println("Map 2"+map2);
		//Clear method - Clears the map
		map2.clear();
		System.out.println("Map 2 after Clearing"+map2);
		//IsEmpty method - 
		System.out.println(map.isEmpty());
		//ContainsKey method - Checks if the Key inside () is present in Map or not
		System.out.println(map.containsKey(5));
		//Contains Value method - Checks if the value inside () is present in Map or not
		System.out.println(map.containsValue("CCC"));
		
		
	}
	

}
