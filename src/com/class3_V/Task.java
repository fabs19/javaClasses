package com.class3_V;

public class Task {

	public static void main(String[] args) {
		// Find the largest of three doubles using if else..if
		
		double d1 = 10.00;
		double d2 = 20.00;
		double d3 = 30.00;

		if ((d1 > d2) && (d1 > d3)) {
			System.out.println("d1 is biggest number");
		} else if ((d2 > d1) && (d2 > d3)) {
			System.out.println("d2 is biggest number");
		} else if ((d3 > d1) && (d3 > d2)) {
			System.out.println("d3 is biggest number");
		} else {
			System.out.println("numbers are equal");
		}
		
		//2. Find largest number amoung three numbers using nested if
				
		int a=120;
		int b=220;
		int c=220;
		//Logic:
		//1.compare number a to b --> if condition is true-->
			//compare a number to c--> if a > c then a-> is the largest else--> b is the largest
		
		if (a > b) {
			if (a > c) {
				System.out.println("a is the biggest number");
			} else {
				System.out.println("c is the biggest number");
			}
		} else { // (a<b) 
			if (b > c) {
				System.out.println("b is the biggest number");
			} else {
				System.out.println("c is the biggest number");
			}
		}
		
		
		
		//3. write program to check Even or Odd number
		
		
		int num=3;
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
	}

}
