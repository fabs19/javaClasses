package com.Class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale --> I am not shopping
		 * if sale --> check the price of thr item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20 --> apply 10%
		 * if price between 20-100 -->20%
		 * if between 100-500 --> 30%
		 * anything else --> 50%
		 * After discount _____ the price of the item reduce from __ to____
		 */
		
		Scanner scan;
		boolean sale;
		double itemPrice;
		double discountPrice=0.0;
		double salePrice=0.0;
		
		
		scan=new Scanner(System.in);
		System.out.println(" is there sale or no sale?");
		 sale=scan.nextBoolean();
		 
		
		
		if (sale == true) {

			System.out.println("what is item price?");
			itemPrice = scan.nextDouble();

			if (itemPrice < 20) {
				discountPrice = itemPrice * 0.1;
				salePrice = itemPrice - discountPrice;
			} else if (itemPrice >= 20 && itemPrice < 100) {
				discountPrice = itemPrice * 0.2;
				salePrice = itemPrice - discountPrice;
			} else if (itemPrice >= 100 && itemPrice < 500) {
				discountPrice = itemPrice * 0.3;
				salePrice = itemPrice - discountPrice;
			} else {
				discountPrice = itemPrice * 0.5;
				salePrice = itemPrice - discountPrice;
			}

			System.out.println("after discount " + discountPrice + " the price of the item reduce from " + itemPrice
					+ " to " + salePrice);

		} else {
			System.out.println("I am not shopping");
		}
		
		
		
		
		
		
		
		
	}

}
