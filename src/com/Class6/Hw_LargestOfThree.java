package com.Class6;

import java.util.Scanner;

public class Hw_LargestOfThree {

	public static void main(String[] args) {
		/*Write a program to find largest of three double values using if-else..if
		 * (if.else if..else if..else ladder)
		 * and logical operators provided by a user (numbers must be distinct)
		 * 
		 * db1
		 * db2
		 * db3
		 * 
		 *     if db1 > db2 &&  db1 > db3
		 * else if db2> db1 &&  db2>   db3
		 * else if db3> db1 &&  db3>   db2
		 * else numbs are equal
		 */
		
		double db1,db2,db3;
		double largestNum = 0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first double value");
		db1=scan.nextDouble();
		
		System.out.println("enter second double value");
		db2=scan.nextDouble();
		
		System.out.println("enter third double value");
		db3=scan.nextDouble();
		
		if (db1>db2 && db1>db3) {
			 largestNum = db1;
			//System.out.println("Largest number is db1");
		}else if(db2>db1 && db2>db3) {
			largestNum= db2;
			//System.out.println("Largest number is db2");
		}else if (db3>db1 && db3>db2) {
			 largestNum=db3;
			//System.out.println("Largest number is d3");
		}else {
			System.out.println("numbers are the same");
		}
		System.out.println("largest number is "+largestNum);
		
		
		//when entering all same numbers how i get it to print right?
		
		
		
	}

}
