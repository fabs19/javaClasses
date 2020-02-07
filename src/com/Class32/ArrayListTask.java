package com.Class32;

import java.util.ArrayList;
/*
 * 
 */

public class ArrayListTask {
	public static void main(String[] args) {

		//Generic
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Max");
		arrayList.add("Kenz");
		arrayList.add("Bob");
		arrayList.add("Mark");
		arrayList.add("Joe");

		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("Max"));
	}

}	
	//non generic
//	ArrayList alist=new ArrayList();
//	alist.add("Hello");
//	alist.add(100);
//	ap;

