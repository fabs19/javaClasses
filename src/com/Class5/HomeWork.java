package com.Class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more.
		 */
		
		Scanner input=new Scanner(System.in);
//		System.out.println("Do you have credit card? true or false");
//		boolean cc=input.nextBoolean();
//		
//		
//		if (cc) {
//			System.out.println("What is the balance on your card?");
//			int balance = input.nextInt();
//
//				if (balance > 1000) {
//					System.out.println("Please pay off your balance");
//				} else {
//					System.out.println("You can spend more money");
//				}
//
//		} else {// this else belong to outer if line  20
//			System.out.println("Would you like to apply for credit card?");
//		}
//		
//		
		System.out.println("*****************************");
		
		
		
		
		System.out.println("enter number of worked years");
		int workedYears=input.nextInt();
	//	System.out.println("Please enter annual salary");
//		int annualSalary=input.nextInt();
		
		if (workedYears >= 5) {
			System.out.println("Please enter annual salary");
			int annualSalary=input.nextInt();
			System.out.println("you are eligible for bonus");
				if (annualSalary > 50000) {
					System.out.println("bonus is = 5000");
				} else {
					System.out.println("bonus = 3000");
				}

		} else {
			System.out.println("you are not eligible for bonus");
		}
		
		
		
		
		
	}

}
