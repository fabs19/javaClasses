package com.Class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// array-collection of similar type of data
		
		int a; //declaring
		a=10;  //assign/initialization
		
		int a1=10;
		
		//1 way-> 2 lines
		//int c[];  //works but not preffered
		
		int[] b; //declare an array--> Preffered way
		b=new int[4];  //initialize
		
		
		//2 way->all in  one line
		int[] array=new int[4];  //declare & initialize 
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//lets create an array that will hold classes
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		
		//Today we have Java Class
		System.out.println("Today we have "+ classes[0]+" class");
		
		int[]nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		//index=size-1
		
		// how can i change 1 to 100
		nums[0]=100; 
		System.out.println(nums[0]);    //100
		System.out.println(nums[0]+nums[2]);  //103
		
		//CONCEPT: The size of an array is FIXED:
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
	//	names[3]="Olga";
//		System.out.println(names[3]);//during run time we will get an excepton
		//exception index out of bounds bc u declare size 3
		//but you have 4 values. ArrayIndexOutOfBoundsException
		
		
		////said will store 4 elements but you only storing 2. Compiler will
		//give default value of dataType:0
		int[]numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		
		
	 /* 
	  * ****
	  * ***   outer R:4    inner Col:4
	  * **
	  * *
	  */
		
		for(int i=4; i>=1; i--) {       //row
			for(int j=1; j<=i; j++) {  //col
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
		
		

	}

}
