package com.Class6;

import java.util.Scanner;

public class Task1_Practice {

	public static void main(String[] args) {
		/* ask user to enter boolean value for sale.
		 * if no sale --> I am not shopping 
		 * if sale --> check the price of the item based on the amount we will have to
	    * calculate the price after discount 
	    * if price < 20 --> apply 10% if price
	    * between 20-100 --> 20% 
	    * if between 100-500--> 30 % 
	    * anything --> 50 %
	    * After discount ___ the price of the item reduce from __ to ___
	    */
		
		Scanner scan;
		boolean sale;
		double price;
		double discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Is there a sale?");
		sale=scan.nextBoolean();
		
		if(!sale) {
			System.out.println("I am not shopping");
		}else {
			System.out.println("Whats the price of item?");
			price=scan.nextDouble();
			
				if(price<20) {
					discount=price*0.1;
				}else if (price>=20 && price<=100) {
					discount=price*0.2;
				}else if (price>=100 && price<=500){
					discount=price*0.3;
				}else{
					discount=price*0.5;
				}
				finalPrice=price-discount;
				//After discount ___ the price of the item reduce from __ to ___
System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+finalPrice);
			
		}
	}

}
