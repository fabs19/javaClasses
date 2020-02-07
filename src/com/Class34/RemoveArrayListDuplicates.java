package com.Class34;

import java.util.*;


public class RemoveArrayListDuplicates {

	public static void main(String[] args) {
		
		// 4.	How  can  you  remove  all  duplicates  from ArrayList?
		//convert it to the set object as set object does not allow duplicates
			
			List<String> aList=new ArrayList<>();
			aList.add("John");
			aList.add("Jane");
			aList.add("James");
			aList.add("Jasmine");
			aList.add("Jane");
			aList.add("James");
		 
			//1st way:
			Set<String> hset=new HashSet<>();
			hset.addAll(aList);
			System.out.println(hset);
			
			aList.clear();
			System.out.println(aList);
			aList.addAll(hset);
			System.out.println(aList);
			
			
			//2nd way
//			System.out.println(aList);
//			HashSet<String>hset=new HashSet<>(aList);
//			System.out.println(hset);

	}

}
