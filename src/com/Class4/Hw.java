package com.Class4;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Scanner scan=new Scanner(System.in);
//	      System.out.println("Please Enter First Name");
//	      String firstName=scan.nextLine();
//	    
//	    System.out.print("Please Enter Surname");
//	    String surname=scan.nextLine();
//	    
//	    System.out.print(firstName+" "+surname);
//	    
	    System.out.println("*****************************");
	    

//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter your name");
//	    String name=scan.nextLine();
//	    
//	    System.out.println("Enter your mobile number");
//	    String mobileNumber=scan.nextLine();
//	    
//	     System.out.println("Enter your age");
//	    int age=scan.nextInt();
//	    
//Final Output: "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"
    
//System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobileNumber);

	System.out.println("*************************************************");
	
	
	

	/*Create a program that will take a boolean value from a user. 
	If the input is True or False, then the output should look like below: 

	First Output: "Input the boolean value"

	Final Output: "The value is ______" 
	 */
//	    Scanner scann=new Scanner(System.in);
//	    System.out.println("Input the boolean value");
//	    boolean value=scann.nextBoolean();
//	    
//	    if(value==true) {
//	    	System.out.println("The value is "+value);
//	    }else {
//	    	System.out.println("The value is "+value);
//	    }
//	    
//	    
	  	
	System.out.println("**********************************************");
	
	/*The variable "num" holds an integer user input
	Write a conditional statement starting on line 9 that does the following:
	If num is positive, print "__ is positive"
	If num is negative, print "__ is negative"

	Examples:
	In: 5
	5 is positive
	In: -2
	-2 is negative
	In: 0
	(no output for zero) 
	 */ 
	
//		  	Scanner inp = new Scanner(System.in);
//		  	System.out.print("In:");
//		  	int num = inp.nextInt();
//		  	//DO NOT CHANGE ABOVE CODE!  Write your code below
//		  	 
//		
//		if(num>0) {
//			System.out.println(num+" is positive");
//		}else {
//			System.out.println(num+" is negative");
//		}
	
	System.out.println("**************************");
	
	
/*Write a Java program to ask the user "Please enter your age". 
Then the program will show if the person is eligible to vote. 
A person who is eligible to vote must be older than or equal to 18 years old and the program will show
 "You are eligible to vote".
Otherwise the program will show "You are not eligible to vote".

Examples:
Please enter your age 18
You are eligible to vote
Please enter your age 16
You are not eligible to vote
*/
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Please enter your age");
//		int age=scan.nextInt();
//		
//		
//		if(age>=18) {
//			System.out.println("You are eligible to vote");
//		}else {
//			System.out.println("You are not eligible to vote");
//		}
//	
//	
//	
	
	System.out.println("***************************************************");
	
/*Write a program to take values of length and width from the user 
 * and check if the shape of an object is square or rectangle. 

Examples:
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle

Please enter the length 16 
Please enter the width 16 
The shape of your object is square	
*/
	
//	Scanner scab=new Scanner(System.in);
//	System.out.println("Please enter the length");
//	int length=scab.nextInt();
//	
//	System.out.println("Please enter the width ");
//	int width=scab.nextInt();
//	
//	if(length==width) {
//		System.out.println("The shape of your object is square");
//	} else {
//		System.out.println("The shape of your object is rectangle");
//	}
//	
//	
	
	
	System.out.println("############################################");
	
	
/*	Write a java program that prints out True if ( x * y ) return a positive value.
 *  Else prints out False if  (x * y) return a negative value. 

Step 1: Your program should ask "Please enter first number" - for the 1st number 
and "Please enter second number" - for the 2nd number.

Step 2: Create the if condition to check if the multiplication of x and y values is positive or negative.

Step 3: If it is a positive value - user will get True, if it is negative value - user will get False.

IMPORTANT: Must use a Scanner class
*/
	
	
//	Scanner scud=new Scanner(System.in);
//	System.out.println("Please enter first number");
//	int numOne=scud.nextInt();
//	
//	System.out.println("Please enter second number");
//	int numTwo=scud.nextInt();
//	
//	int mult = numOne*numTwo;
//	if (mult<0) {
//		System.out.println("false");
//	} else {
//		System.out.println("true");
//	}
//	
	
	
	System.out.println("#############");
	
/*Write a program that shows if you input a number it will display a month with corresponding number, 
 * and if you input a number out of bounds (12) 
 * it will display invalid. Display the months to be displayed on my output.

IMPORTANT: use Scanner Class

Example:
1 will display January
2 will display February
3 will display March
4 will display April
5 will display May
6 will display June
7 will display July
8 will display August
9 will display September
10 will display October
11 will display November
12 will display December
ANY INPUT outside of 12 should display in output "Invalid"
*/
	
	
	Scanner stub=new Scanner(System.in);
	System.out.println("enter number");
	int num=stub.nextInt();
	
	if(num==1) {
		System.out.println("will display January");
	}else if(num==2) {
		System.out.println("will display February");
	}else if(num==3) {
		System.out.println("will display March");
	}else if(num==4) {
		System.out.println("will display April");
	}else if(num==5) {
		System.out.println("will display May");
	}else if(num==6) {
		System.out.println("will display June");
	}else if(num==7) {
		System.out.println("will display July");
	}else if(num==8) {
		System.out.println("will display August");
	}else if(num==9) {
		System.out.println("will display September");
	}else if(num==10) {
		System.out.println("will display October");
	}else if(num==11) {
		System.out.println("will display November");
	}else if(num==12) {
		System.out.println("will display December");
	}else {
		System.out.println("Invalid");
	}
	
	
	
	
	}

}
