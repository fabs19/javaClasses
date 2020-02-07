package com.Class35;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HwClass {

	public static void main(String[] args) {
	
		Map<Integer, String> map=new TreeMap<>();
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP Printer");
		map.put(3468, "Dell Screen");
		map.put(8753, "Samsung TV");
		map.put(1765, "Sony Camera");
		
		//to retrieve  key- values using entry set
		Set<Entry<Integer,String>> set=map.entrySet();
		for(Entry<Integer,String>entry:set) {
			//get rest
		}
	}

}
