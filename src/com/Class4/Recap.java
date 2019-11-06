package com.Class4;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;  //declaration
		num=23;	  //initialize
		num=90;
		num-=200;  //-110=90-200 negative
		num-=110;   // -220=-110-110
		num+=220;   //0=-220+220
		

		if (num > 0) {
			System.out.println(num + " is positive number");

		} else if (num == 0) {
			System.out.println("Value of num is " + num);
		} else {
			System.out.println(num + " is a negative number");
		}
		
		//IQ:First way even or odd(7,8)
		int i=137;
		
		if(i%2==0) {  //if number divisible by 2 and no remainder its even
			System.out.println(i+" is an even number");
		}else {
			System.out.println((i+" is an odd number"));
		}
		
		//Second way
		
		if(i%2!=0) {  //number divided by 2 and theres any other output besides 0 number is odd
		System.out.println(i+" is an odd number");  //theres remainder
		}else {
			System.out.println(i+" is an even number");
		}
		
		
		
		
		
		
	}

}
