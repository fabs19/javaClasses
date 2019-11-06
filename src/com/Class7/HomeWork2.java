package com.Class7;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* You need to ask user to pay for coffee
		* You need to keep asking user to pay for it until
		* entered price is equal =5; 
		* After user paid then say “Enjoy your coffee!”
		* no increment bc variable dependant on whatever is entered
		*/
		
		Scanner scan=new Scanner(System.in);
		
		boolean paymentInFull = false;
		double paidMoney = 0.0;
		while (!paymentInFull) {
		System.out.println("Please put in cash:");
		paidMoney = paidMoney + scan.nextDouble();
		
		if(paidMoney<5.00) {
			System.out.println("Your balanace is: $"+paidMoney);
		} else if (paidMoney>5.00) {
				paymentInFull = true;
				System.out.println("Enjoy your coffee! Please see below for your change of :$"+(paidMoney-5));
		}else {
			paymentInFull = true;
			System.out.println("Enjoy your coffee!");
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
