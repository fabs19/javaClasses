package com.Class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums=new int[4];
		
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		//to find # of elements we use .length
		System.out.println(nums.length);
		
		//                0          1       2        3
		String[] array= {"Winter","Fall","Summer","Spring"};
		//Print i was born in Summer
		System.out.println("I was born in "+ array[2]);
		//array.lenght will return an integer
		int arraySize=array.length;
		System.out.println(array.length);
		
		
		
		int[]score= {80,90,70,100,99};
		
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[0]);
		
		
		

		//Create an array of names and store all names of your group.
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[]names= {"Fabi","Shubha","Gunay","Shugoufa","Emily","Seda"};
		System.out.println(names[0]);
		
		
		

		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 

		String[]words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		
		
		
		
	}

}
