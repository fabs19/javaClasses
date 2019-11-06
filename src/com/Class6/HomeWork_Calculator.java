package com.Class6;

import java.util.Scanner;

public class HomeWork_Calculator {

	public static void main(String[] args) {
	/* 3.HomeWork: Using scanner class create calculator. 
	 * Allow user to enter 2 numbers and operator(+,-,*,/). 
	 * Based on operator provide the result to user.
	 */
		Scanner scan;
		int firstNum,secondNum,result = 0;
		char operator;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		firstNum=scan.nextInt();
		
		System.out.println("Please enter operator: +,-,*,/");
		operator=scan.next().charAt(0);
		
		System.out.println("Please enter second number");
		secondNum=scan.nextInt();
		
		
		
		switch(operator) {
		case '+':
			result=firstNum+secondNum;
			break;
		case '-':
			result=firstNum-secondNum;
			break;
		case '*':
			result=firstNum*secondNum;
			break;
		case '/':
			result=firstNum/secondNum;
		default:
			System.out.println("invalid operation");
		}
		System.out.println("Result is: "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
