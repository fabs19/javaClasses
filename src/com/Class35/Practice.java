package com.Class35;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		//*How  can I access/update just 1 value from the Set collection
		//-convert it to arrayList(keeps order)
			
				Set<String> lset=new LinkedHashSet<>();//keep the order no duplicate
				lset.add("Morning");
				lset.add("Noon");
				lset.add("Evening");
				lset.add("Night");
				//convert to the arrayList
				List<String> alist=new ArrayList<>();  //creating object of arrayList not passing value in constructor
				alist.addAll(lset);  //using addAll method can add another collection
				String element=alist.get(2);
				System.out.println(element);
				
				
				//2nd:Another way to create an Object of ArrayList by passing values to the constructor
				List<String> alist1=new ArrayList<>(lset);
	}

}
