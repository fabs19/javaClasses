package com.Class8;

import java.util.Scanner;

public class TaskBreakContinue {

	public static void main(String[] args) {
		//1. Print numbers from 1 to 50 except those that are divisible by 3
		
		//my way:
		for(int i=1; i<=50; i++) {
			if(i%3!=0) { //==
				System.out.println(i);
				continue;
			}
			
		}
		
		//1.asels way:
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		
		
		//2.Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an "yes" from a user program should stop asking.
		
		String card;
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Are you apply for credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("Yes")) {
				break;
			}

		}
		
		

	}

}
