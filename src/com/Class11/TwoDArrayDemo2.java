package com.Class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]names= {
				{"Khan","Yousuf","Alex","Zynab"},
				{"Mohammad","Ann","Naslyhan","Weqas"},
				{"Diago","Asif","Zubair","Shagofa"},
				
				
				
		};
		
		int lengthOfRows=names.length;  //#arrays/rows
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[0].length;  //#elements
		System.out.println(lengthOfCols);
		
		//enhanced loop
		//for(dataType variable[]:nameOfArray)
		
		for(String getArrays[]:names) {
			for(String getName:getArrays) {  //getname is elements
				
				System.out.println(getName+" ");
		}
			System.out.println();
		
		
	}

}}
