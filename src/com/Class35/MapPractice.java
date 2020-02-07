package com.Class35;

import java.util.HashMap;

public class MapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		//to store key+value pair into map
		map.put(101,"John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag=map.isEmpty(); 
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
		//I want to add more Entry Objects
		map.put(105, "John");  //adding duplicate values -->OK
		System.out.println(map);
		map.put(102, "Hasan"); //adding duplicate keys--> Override, we cannot have duplicate keys
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the existing value
		map.replace(103, "Zeynep");
		System.out.println(map);
		
		//how to remove an Object from a map
		map.remove(101);
		System.out.println(map);
		System.out.println("-----------------");
		//how to verify if certain key is exist
		boolean flag1=map.containsKey(200); //is the keyy 200 there?
		System.out.println(flag1);
		
		if(flag1) {
			map.replace(200, "Seval"); //if key there replacing value of key
		}else {
			map.put(200, "Seval"); //if key not there, creating the key
		}
		
		//how to verify if certain value is exist
		boolean contains=map.containsValue("Seval");
		System.out.println(contains);
		System.out.println(map);
		
		System.out.println("----------------------");
		/*Create a map of building. Store floor number and its associated company name.
		 * (Ex: 1=Google,2=Syntax, etc..) Insert 7 entries with duplicate keys and values.
		 * check how many entries you have
		 * update company on 4th floor
		 * remove company on the 7th floor 
		 * print your map
		 */
		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(1, "Google");
		hmap.put(1, "Syntax");
		hmap.put(3, "Accenture");
		hmap.put(4, "PWC");
		hmap.put(5, "PWC");
		hmap.put(6, "Twitter");
		hmap.put(7, "Dell");
		System.out.println(hmap.size());
		System.out.println(hmap);
		hmap.replace(4, "Geico");
		hmap.remove(7);
		System.out.println(hmap);
		
		

	}

}
