package com.Class7;

import java.util.Scanner;

public class DoWhileSoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a right amount print "Please enjoy your soda"*/
		//ask user then repeat until get right amount, do while:let execute ur code at least once u need to keep looping until condition becomes false
		Scanner scan;
		double price;
		scan=new Scanner (System.in);
		
		do { //we  want this action to be excecuted at least once
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
			
		}while(price!=1.99);//as long as condition true will keep looping go back to line 16. As long as price is not equal to $1.99
		
		System.out.println("Please pay for soda");
		
		

	



//while :checks condition then execute

		
		
		
		
	}

}
