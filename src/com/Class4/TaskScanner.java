package com.Class4;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
 *  If loan is less than 200,000 then you would lend the money
 *   otherwise you would reject the client.
 */

//		Scanner myScanner=new Scanner(System.in);
//		System.out.println(" what is the amount of loan is needed?");
//		int loan=myScanner.nextInt();
//		
//		
//		if(loan<200000) {
//			System.out.println("I will lend the money");
//		}else {
//			System.out.println("I will reject the loan");
//		}
//		
		
		System.out.println("******************************************");
		
/*2.You are DMV representative and you need to ask customer their age.
 *  If they are 18 and older you will issue a driver licensce to them, 
 *  otherwise you will offer them to get a learners permit.
 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter your age");
//		int age=scan.nextInt();
//		
//		if(age>=18) {
//			System.out.println("Issue drivers license");
//		}else {
//			System.out.println("Offer learners permit");
//		}
		
		
		System.out.println("*************************************************");
		
		
/*Create a Java program that will ask user to input temperature and city.
 *  Your program should convert Fahrenheit into celsius
 *   and print “The temperature is the city __ is __”
 */
		//capture string value first then number
		
		Scanner scans=new Scanner(System.in);
		System.out.println("Please enter temperature");
		double temp=scans.nextDouble();
		
		System.out.println("Please enter city");
		String cityName=scans.next();
		
		temp=(temp-32)*5/9;
		System.out.println("The temperature in the city "+cityName+" is "+temp+"C" );
		
		
	}

}
