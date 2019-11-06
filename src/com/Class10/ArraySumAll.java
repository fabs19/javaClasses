package com.Class10;

public class ArraySumAll {

	public static void main(String[] args) {
		/*IQ!!!
		 * Declare an array of integers and then find the sum of all integers
		 */

		int[]array= {25,4,8,23,1};
		
		int sum=0;
		
		for(int i=0; i<array.length;i++) {
			sum+=array[i];  //sum=sum+array[i]
		}
		System.out.println("The sum is "+sum);
		
		
	}

}
