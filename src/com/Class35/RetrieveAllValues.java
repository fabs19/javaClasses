package com.Class35;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RetrieveAllValues {

	public static void main(String[] args) {

		// Create a map of a person(name,lastName, address, city, state)
		Map<String, String> personMap = new HashMap<>(); //->no order
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		System.out.println(personMap);
		
		System.out.println("-----Printing all values-------------");
		Collection<String> values = personMap.values();
		System.out.println("---------------For each loop--------------");
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("--------------iterator---------------------");
		Iterator<String> valuesIterator = values.iterator();
		while (valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}

	}
}