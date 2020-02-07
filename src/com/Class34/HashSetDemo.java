package com.Class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// Lets create a collection of veggies where I don not want to have duplicates
		//hset order of the elements is not preserved
		HashSet<String> hset=new HashSet<>();
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//they do not have any methods to retrieve elements from the colloection
		//.get(); .set();
		
		//how can we retrieve all elements?
		//1.Iterator
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next(); //storing in a variable
			System.out.println(element);
		}
		
		//2.enhanced for Loop
		System.out.println("-----------enhanced loop---------------");
		for (String el : hset) {
			System.out.println(el);
			
		}

	}

}
