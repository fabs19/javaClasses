package com.Class34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamilyMembers {

	public static void main(String[] args) {
		//cretae a collection tat won't allow duplicates 
		//and preserves the insertion order
		Set<String> fruitSet=new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinneaple");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		//create a collection that wont allow duplicates
		//and sorts objets in ascending order (0-9,A-z)
		Set<Integer> tset=new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);
		
		System.out.println(tset.size());
		System.out.println(tset);
		
		//adding collection into a collection
		
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Seleniuim");
		list.add("TesNG");
		
		
		Set<String> linkedSet=new HashSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		
		System.out.println("----Objects from both collections------------");
		System.out.println(linkedSet);
		
	}

}
