package com.Class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hw2 {
        /* *2. Create  a  Set  of  cities  in  which  you  want  to make sure
		 *   that insertion order is maintained.-->linkedHash set
		 *    Using Iterator remove any city that starts with “A”;
		 */
	public static void main(String[] args) {
		
		Set<String> cities=new LinkedHashSet<>();
		cities.add("San Diego");
		cities.add("Atlanta");
		cities.add("New York");
		cities.add("Boston");
		cities.add("Miami");
		cities.add("Fairfax");
		System.out.println(cities);
		
		System.out.println("-----------Iterator--------------");
		Iterator<String>itr=cities.iterator();
		while (itr.hasNext()) {
			String cty = itr.next();
			if (cty.startsWith("A")) {
				itr.remove();
			}
		}
		System.out.println(cities);
		
	}
}
