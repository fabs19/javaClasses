package com.Class35;

import java.util.HashMap;

public class Task {
	/*Create a map of building. Store floor number and its associated company name.
	 * (Ex: 1=Google,2=Syntax, etc..) Insert 7 entries with duplicate keys and values.
	 * check how many entries you have
	 * update company on 4th floor
	 * remove company on the 7th floor 
	 * print your map
	 */
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Syntax");  //duplicates key gets OVerriden
		map.put(4, "Accenture");
		map.put(5, "Delloite");
		map.put(6, "Apple");
		map.put(7, "Google");
		
		//check how may entries you have
		System.out.println(map.size());
		System.out.println(map);
		System.out.println("------------------------");
		//update/replace company on a 4th floor
		map.replace(4, "Whole Foods");
		System.out.println(map);
		System.out.println("-------------------------");	
		//remove company on the 7th floor		
		map.remove(7);
		System.out.println(map);
		System.out.println("-------------------------");
		
		

	}

}
