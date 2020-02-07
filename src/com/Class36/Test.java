package com.Class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * In Test Class create a Map that will store key in ascending order.
 *  In that map store personId and a Person Object. Print each object details.

 */
public class Test {

	public static void main(String[] args) {
		Map<Integer, Person> personMap=new TreeMap<>();
		personMap.put(1, new Person("Cindy","Burke", 23, 100000));
		personMap.put(2, new Person("Mark", "Jones", 33, 60000));
		personMap.put(3, new Person("Carrie", "Hanson", 39, 120000));
		personMap.put(4, new Person("Joe", "Jonas", 25, 160000));
		
		Set<Entry<Integer,Person>> pSet=personMap.entrySet();
		Iterator<Entry<Integer,Person>>itr=pSet.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Person>ent=itr.next();
		//	int i= ent.getKey();
			//Person person=ent.getValue();
		//	System.out.println(i);
	//		person.userDetails();
			System.out.println(ent.getKey()+":");
			ent.getValue().userDetails();
		}
		
		
		
	}

}
