package com.Class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*Ask user to enter the month they were born 
		 * based on the month define the season
		 * if user is born in january, februaury, december ---> season is winter
		 * if march, april , may, ---> spring
		 * if june, july, august ---> summer
		 * if sept, oct, nov -->fall
		 * otherwise --> unknown
		 * at the end of the program 
		 * "you were born in ________"<-season
		 * based on month define season only one sys out
		 */

		Scanner scan;
		String month;
		String season;
		
		 scan=new Scanner(System.in);
		 System.out.println("Please enter month born");
		 month=scan.nextLine();
		
		
		if(month.equals("january")||month.equals("february")||month.equals("december")) {
			season="winter";
		}else if (month.equals("march")||month.equals("april")||month.equals("may")) {
			season="spring";
		}else if (month.equals("june")||month.equals("july")||month.equals("august")) {
			season="summer";
		}else if (month.equals("september")||month.equals("october")||month.equals("november")) {
			season="fall";
		}else {
			season="unknown";
		}
		System.out.println("you were born in "+ season);
		System.out.println("month");
		
		
		
		
		
		
		
		
		
		
	}

}
