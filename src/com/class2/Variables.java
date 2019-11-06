package com.class2;

public class Variables {

	public static void main(String[] args) {
//a) create diff types of variables to store students info and then print value of those variables
		
		String name="John";
		String lastName="Doe";
		char grade='A';
		String city="Fairfax";
		String state="VA";
		long phoneNumber=7038786767l;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
//b) change students city, state, phone number and grade. Print those updated values
		
		//String city="Alexandria"  WRONG already declared String once
		city="Alexandria";
		state="FL";
		phoneNumber=7038269323l;
		grade='B'; 
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		//My name is ___
		//I live in city of _________
		//My phone number is
		
		System.out.println("My name is "+name);
		System.out.println("I live in city of "+city);
		System.out.println("My phone number is "+phoneNumber);
		
		int num1=12;
		int num2=13;
		
		//The value of num1=___ and the value of num2=____
		System.out.println("The value of num1="+num1+" and the value of num2="+num2);
		
		String fruit="bannana";
		char dollar='$';
		double price=1.99;
		//The price of banana is $1.99 !!!
		System.out.println("The price of "+fruit+ " is "+dollar+price+"!!!");
		
		
		
		
		
		
		
		
		
		

	}

}
