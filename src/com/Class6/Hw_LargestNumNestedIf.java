package com.Class6;

import java.util.Scanner;

public class Hw_LargestNumNestedIf {

	public static void main(String[] args) {
		/*Program to find largest number among three numbers using nested if provided by a user
		 *(numbers must be distinct)
		 */

		int a,b,c;
		
		System.out.println("Please enter three numbers");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println("a is biggest number");
			} else { // (c>a)
				System.out.println("c is biggest number");
			}

		} else { // (b>a)
			if (b > c) {
				System.out.println("b is biggest number");
			} else {// (c>b)
				System.out.println("c is biggest number");
			}

		}
		
		

	}

}







