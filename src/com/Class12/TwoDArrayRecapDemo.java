package com.Class12;

public class TwoDArrayRecapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1=new int [2][3];
		
		//first row
		array1[0][0]=9;
		array1[0][1]=10;
		array1[0][2]=11;
		
		//second row
		array1[1][0]=9;
		array1[1][1]=10;
		array1[1][2]=11;
		
		for(int i[]:array1) {     //first wayy
			
			for(int j:i) {  //loops thru i, use nested loop
				System.out.println(j);
			}
		}
		
		System.out.println("===================================");
		
		
		int[][] array2= {    //2nd way
				{44,55,67},
				{11,22,33},		
		};
		
		
		 for (int[] is : array2) {
			for(int is2: is) {
				System.out.println(is2);
			}
		}
		
		
		
		
		
		
	}

}
