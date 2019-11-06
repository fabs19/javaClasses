package com.Class10;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print even elements 
		int[]numbers= {12,15,14,14,17,16};
		
		
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]);
			}
			
		}
		
		//find sum of all integers
		int[]array= {90,88,4,56,32,45};
		int sum=0;
		for(int i=0; i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("The sum of numbers is: "+sum);
		
		
		
		
		
		
		
		
		
	}//main

}

		
		
	


