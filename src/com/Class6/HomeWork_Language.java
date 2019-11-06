package com.Class6;

import java.util.Scanner;

public class HomeWork_Language {

	public static void main(String[] args) {
		/* 1.Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 */

		Scanner scan;
		//String country;
		String language=null;
		
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		
		switch(country) {
		case "Korea":
			language="Korean";
			break;
		case "USA":
			language="English";
			break;
		case "Russia":
			language="Russian";
			break;
		case "China":
			language="Mandarin";
			break;
		default:
			language="Invalid";
		}
			
		System.out.println("You speak "+language);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
