package com.Class11;

public class Task {

	public static void main(String[] args) {
		//loooook ovvver Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		
		
		int [][]numbers= {
				
				{10,20,30,40},
				{50,60,70,80},
				{5,10,15,20},
				
			
		};
	
		for(int getArrays[]:numbers) {
			for(int getNumber:getArrays) {
				System.out.println(getNumber+" ");
			}
			System.out.println();
		}
		

	}

}
