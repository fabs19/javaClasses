package com.Class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		
		//retrieve value from an arrayList
		int element=numbers.get(0);
		System.out.println(element);
		
		//1.for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2.advanced loop   for(dataType variableName: nameofArray)
		for(int num:numbers) {
			System.out.println(num);
		}
		
		//get values backwards using for loop
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		//get values backwards using advanced loop- not possible
		
		//3. using iterator -iterates thru each object
		//with iterator use ONLY while loop
		//loop starts from beggining of collection checks is there a next element while there is keep looping
		//while loop-loop as long as the condition is true
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {
			int number=iterator.next();  //autounboxing
			//System.out.println(iterator.next());
		}
		
	}


	
	
}
