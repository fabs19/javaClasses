package com.Class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		 /*nextInt();-->for numbers
		  * nextLine(); Strings
		  * nextDouble(); double		
		  */
		
		Scanner scan=new Scanner(System.in);  //creating obj of scanner
		System.out.println("Please enter number");
		int number=scan.nextInt();
		System.out.println("Number is "+number);
		
		System.out.println("*****************************************");

		
		Scanner input=new Scanner(System.in);  //creating obj of scanner
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon "+name);

	}

}
