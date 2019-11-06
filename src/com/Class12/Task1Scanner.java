package com.Class12;

import java.util.Scanner;

public class Task1Scanner {
//look over to understand
	public static void main(String[] args) {
		// add values to arraylist from scanner taking input from user

		int[] array2= {2,5,4,7};
		
		for(int i:array2) {
			System.out.println(i);
		}
		int[]arr=new int[3];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) { //allow use to enter mult values
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" "); //this loop prints values from array
		}
		
	}

}
