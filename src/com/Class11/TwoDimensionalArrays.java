package com.Class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare 2D Array:
		
		int[][] array=new int[3][4];
		
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3nd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=80;
		
		System.out.println(array[1][3]);
		
		//Task: create 2D array of String with 2 row and 3 columns.
		//print values in 2nd row and 3rd col.
		
		String[][] arr=new String [2][3];
		
		//1st row
		arr[0][0]="bike";
		arr[0][1]="Hello";
		arr[0][2]="Bye";
		
		//2nd row
		arr[0][0]="car";
		arr[0][1]="bus";
		arr[0][2]="train";
		///////
		
		
		
		  System.out.println("***********");
		  //get name of array and from which array u want those values
		  
	        int [][] numbers= {
	 /*row1-->*/    {8,7,5,3,8},    //index 0
	                {1,5,6,4,9},    //index 1
	                {3,6,8,0,7}     //index 2
	        };
	        
	        System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
	        
	        //To identify the numbers of Rows/array:
	        System.out.println("The numbers of Arrays are:= "+numbers.length);
	        
	        //To identify the numbers of Columns/elements in that row
	        System.out.println("The numbers of Rows are:= "+numbers[0].length);
	    
	
	        System.out.println("============");
	        System.out.println();
	        
	        for(int i=0;i<numbers.length;i++) {
	            for(int j=0;j<numbers[i].length;j++) {
	                System.out.println(numbers[i][j]+" ");
	            }
	        }

		
		
		
	}

}
