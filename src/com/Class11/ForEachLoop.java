package com.Class11;

public class ForEachLoop {

	public static void main(String[] args) {
		//enhanced loop/advanced loop
		//introduced in java 1.5
		//Only used only to retrieve or extract values from array or collections
		
	//	int[]numbersList= {2,3,5,7};
		
		//Syntax:
		
//		for(dataType element:variableName ) {
//			System.out.println(element);
//		}
//		
//		for (type var : array) 
//   	{ 
//	     statements using var;
//		}
		
		int[]numbersList= {2,3,5,7};
		
		for(int element:numbersList) {
			System.out.println(element);
		}
		
		//
		int[]array=new int[7];
		array[0]=33;
		

	}

}
