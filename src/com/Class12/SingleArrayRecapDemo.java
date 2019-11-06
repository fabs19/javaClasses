package com.Class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=12;
	
		//retrieve valu from array:i
		//System.out.println(array1[1]);
		
		//retrieve all values: how to sum
		int num1=0;
		for (int i = 0; i < array1.length; i++) {
			
			num1=num1+array1[i];
			System.out.println(array1[i]);
		}
		System.out.println("The sum of array is is"+num1);
		
		
		System.out.println("============================");
		
		//for each: used to retrieve all values from array:
		int[] array2= {2,5,4,7};
		
		for(int i:array2) {
		
			System.out.println(i);
		}
		
		
	}

}
