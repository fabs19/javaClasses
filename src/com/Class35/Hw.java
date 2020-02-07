package com.Class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hw {
	//Entry is a interface
	public static void main(String[] args) {
		/*
		 *1. Create a map of Best Buy store. Place
		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
 
		1.2 Retrieve all keys and values from a Best Buy map using EntrySet.
		 */
		
		//1.
        Map<Integer, String> bbMap=new HashMap<>(); //->no order.
		
		bbMap.put(7664847, "Printer");  //-->entry , collection of entry=set
		bbMap.put(7879885, "TV");
		bbMap.put(7879886, "Xbox");
		bbMap.put(7879887, "Laptop");
		
		System.out.println(bbMap);
		
		//1.2    set=collection Entry=object has methods:getKey() and getValue(). <k,v>
		Set<Entry<Integer,String>> bestbuy=bbMap.entrySet();  //
		
		System.out.println("----------advanced loop--------------");
		for (Entry<Integer, String> entry : bestbuy) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("-------------Iterator-----------------");
			Iterator<Entry<Integer,String>> itr=bestbuy.iterator();
			while(itr.hasNext()) {
				Entry<Integer,String>it=itr.next();
				String entry=it.getKey()+"-->"+it.getValue();
				System.out.println(entry);
			}
	}

}
