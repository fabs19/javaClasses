package com.Class11;

public class HwArray_AllValues {

	public static void main(String[] args) {
		// 1.Create an array of cars and store 6 elements into it. 
		// Print all values from the array.

		
		String[] cars= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		
		//for each loop way:
		String[] cars2= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
	
		
		for(String element:cars2) {
			System.out.println(element);
		}
		
		
		
	}

}
