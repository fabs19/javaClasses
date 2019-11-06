package com.Class7;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// do while way:

		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
			
		}while(price!=5);
		System.out.println("Enjoy your coffee");
		
		
		
		
		
	}

}
