package com.class3_V;

public class Recap {

	public static void main(String[] args) {
		// switch case; use when testing multiple conditions. Similar to if..else if..else
		//switch works with:short, String, char, int, byte
		
		//declare grade.Based on the grade I will print messages
		//A-excellent, B-good, C-average, D-fair, anything else: "go back and study"

		char grade='A';
		
		switch(grade) {
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("average");
			break;
		case 'D':
			System.out.println("fair");
			break;
		default:
			System.out.println("go back and study");
		}
		
		//Nested if: if inside another if
		//only when first condition is true/staisfies --> inside/second if will be executed
		
		//Declare interest rate and amount:
		//I am trying to buy a house: 1.if interest rate<4.5 --> I will consider buying else I wont buy
										//if the sum>200000 --> then I will take a loan else I will pay cash.
		
		double intRate=3.5;
		int sum=300000;
		
		if (intRate < 4.5) {
			System.out.println("I will consider buying house");
			if (sum > 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay in cash");
			}

		} else {
			System.out.println("I wont buy house");
		}
		
		
		

	}

}
