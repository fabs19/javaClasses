package com.Class11;

public class HwArray_SumAll {

	public static void main(String[] args) {
		/* 2.Create an array on integers and calculate the sum of all elements in an array.
		 */

		int[] numbers= {12,5,76,33,2,18};
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			sum+=numbers[i];
		}
			System.out.println("The sum of all elements is: "+sum);
			
			
			
		//For Each Way:
			
			int[] numbers2= {12,5,76,33,2,18};
	
			int sum2=0;
			
			for(int element:numbers2) {
				
				sum2+=element;
			}
			System.out.println("The sum of all element is: "+sum2);
			
			
			
			
	}

}
