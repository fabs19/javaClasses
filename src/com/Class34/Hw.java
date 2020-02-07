package com.Class34;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw {

	public static void main(String[] args) {
		/*
		 *1. Create a Set collection in which you need to add  names  of  the  countries. 
		 *   In  this  set  we want all objects to be sorted in alphabetical order.-->TreeSet 
		 *   Using  2  different  ways  retrieve  all elements from set.
		 */ 
		   
		Set<String>countries= new TreeSet<>();
		countries.add("Colombia");
		countries.add("Albania");
		countries.add("Bolivia");
		countries.add("Korea");
		countries.add("France");
		countries.add("Spain");
		countries.add("Portugal");
		System.out.println(countries);
		
		//2 ways retrieve all elements
		System.out.println("----- advanced Loop----------------");
		for (String element : countries) {
			System.out.println(element);	
		}
		
		System.out.println("----------Iterator------------------");
		Iterator<String> itr=countries.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
				
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*
		 
		
		4.	How  can  you  remove  all  duplicates  from ArrayList?
			
			List<String> aList=new ArrayList<>();
			aList.add("John");
			aList.add("Jane");
			aList.add("James");
			aList.add("Jasmine");
			aList.add("Jane");
			aList.add("James");
		 */

	}

}
