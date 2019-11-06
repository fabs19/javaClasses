package com.Class7;

import java.util.Scanner;

public class HwWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//asels do while way
		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
			
		}while(price!=5);
		System.out.println("Enjoy your coffee");
		
		
		//asels while loop way:
		int price1;
		System.out.println("Please pay for your coffee");
		price1=scan.nextInt();
		
		while(price1!=5) {
			System.out.println("Please pay for your coffee");
		}
		
		System.out.println("Enjoy your coffee");
		
		
		
		
	}

}
