package com.Class35;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		//1.Create a map of countries with its capital that will store countries in 
		//alphabetical order.
		//Print all keys and values from a country map using for each loop and iterator
		//Print all values from a country map using for each loop and iteartor
		
		
		
		Map<String,String> countriesMap=new TreeMap<>();
		
		countriesMap.put("USA", "District of Columbia");
		countriesMap.put("China","Beijing");
		countriesMap.put("Japan", "Tokyo");
		countriesMap.put("Austria","Vienna");
		countriesMap.put("Bolivia", "La Paz");
		
		System.out.println(countriesMap);
		//1.Print all keys and values from a country map using for each loop and iterator
		
		Set<String> keys=countriesMap.keySet();
		
		System.out.println("----------using for each loop------------------");
		
		for(String key: keys) {
			System.out.println(key+":"+countriesMap.get(key));
		}
		System.out.println("----------using Iterator------------------------");

		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			//System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next()));
			String mapKey=keysIterator.next();
			String mapValue=countriesMap.get(mapKey);
			
			System.out.println(mapKey+"_"+mapValue);
		}
		
	}//mm

}//c
