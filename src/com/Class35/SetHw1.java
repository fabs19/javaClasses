package com.Class35;

import java.util.*;

public class SetHw1 {

	public static void main(String[] args) {
		/*1.
		 * Create a Set collection in which you will need to add names of the countries.
		 * In this set we want all objects to be sorted in alphabetical order.
		 * Using 2 different ways retrieve all elements from set.
		 */
		
		
		Set<String> countries=new TreeSet<>();
		countries.add("Thailand");
		countries.add("Bolivia");
		countries.add("Australia");
		countries.add("Spain");
		countries.add("China");
		//System.out.println(countries);
		
		//1.
		System.out.println("--------for each loop--------------");
		
		for(String element:countries) {
			System.out.println(element);
		}
		
		//2.
		System.out.println("---------Iterator-----------------");
		
		Iterator <String> itr=countries.iterator();
		while(itr.hasNext()) {
			String country=itr.next();
			System.out.println(country);
			
		}
		
		System.out.println("-----------task 2----------------");
		/*2.
		 * Create a set of cities in which you want to make sure that insertion order
		 * is maintained. Using iterator remove any city that starts with "A".
		 */
		
		Set<String>cities=new LinkedHashSet<>();
		cities.add("Alexandria");
		cities.add("Fairfax");
		cities.add("Chantilly");
		cities.add("Annapolis");
		cities.add("New York");
		cities.add("Vienna");
		cities.add("Annandale");
		
		Iterator <String> itrr=cities.iterator();
		while(itrr.hasNext()) {
			String city=itrr.next();
			if(city.startsWith("A"))itrr.remove(); {	
			}
			
		}
		System.out.println(cities);
		
		
	}

}
