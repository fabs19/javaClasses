package com.Class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String country, foodName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		case "Turkey":
			foodName="kebab";
			break;  //stops execution inside case
		case "Ethiopia":
			foodName="Tibs";
			break;
		case "Morocco":
			foodName="Tajin";
		case "Pakistan":
			foodName="Biryani";
			break;
		case "Russia":
			foodName="Caviar";
			break;
		case "Cuba":
			foodName="Sofrito";
			break;
		default:
			foodName="Unkown";
				
		}
		System.out.println("You are from "+country+" and your favorite food is "+foodName);
		
		
		
		
	}

}
