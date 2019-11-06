package com.Class6;

import java.util.Scanner;

public class HomeWork_Grade {

	public static void main(String[] args) {
		/*2. Allow user to enter grade and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 *  At the end your program should print which grade was entered by a user with explanation.
		 */
		Scanner scan;
		char grade;
		String explanation;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter grade");
		grade=scan.next().charAt(0);
		
		
		switch(grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		
		default:
			explanation="Not Acceptable";
		}
		System.out.println("Grade entered: "+grade+" "+explanation);
		
	}

}
