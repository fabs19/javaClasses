package com.Class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		// Create a mapp of groceries that will store products and its quantities
		//ans we want maintain the insertion order for keys
		
		Map<String,Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);
		
		//retrieve single value
		groceryMap.get("Apple");
		
		//verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);
		
		//how to retrieve all values
		Collection<Integer> values=groceryMap.values();
		//1. enhanced loop
		for (Integer val : values) {
			System.out.println(val);
			
		}
		
		//2.iterator
		Iterator<Integer>valItr=values.iterator();
		while(valItr.hasNext()) {
		System.out.println(valItr.next());
			
		}
		//get all keys and map them  to values (milk-->2)
		//2 ways entry set or key set
		//1.key set
		Set<String>keys=groceryMap.keySet(); 
		for(String k:keys) {    //k holding keys  //(String k:groceryMap.keySet());
			System.out.println(k.toUpperCase()+"-->"+groceryMap.get(k));
		}
		System.out.println("---------Iterator-------------");
		//2. iterator (milk-->2) in lowercase
		Iterator<String>keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();  //holding value of key
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"-->"+val);
		}
		
		//get all keys and map them to values (milk-->2) using entrySet
		System.out.println("-------entry set------------------");
		Set<Entry<String, Integer>> entr=groceryMap.entrySet();
		for(Entry<String,Integer>e:entr) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}

	}
}