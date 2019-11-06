package com.Class10;

public class TaskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[0]);
		
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades);
		
		
		char[]grades1=new char[6];
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';
		System.out.println(grades1[0]);

		

	

		//2.Create an array of names and store all names of your group.
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[]names= {"Fabi","Shubha","Gunay","Shugoufa","Emily","Seda"};
		System.out.println(names[0]);
		
		
		String[]names1=new String [6];
		names1[0]="Fabi";
		names1[1]="Shubha";
		names1[2]="Gunay";
		names1[3]="Shugoufa";
		names1[4]="Emily";
		names1[5]="Seda";
		System.out.println(names1[0]);
		
		
		

		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 

		String[]words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		String[]words1=new String [5];
		words1[0]="Saturday";
		words1[1]="is";
		words1[2]="Java";
		words1[3]="coding";
		words1[4]="day";
		System.out.println(words1[0]+words[1]+words[2]+words[3]+words[4]);
		
		
		
		
	}
}
		
