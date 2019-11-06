package com.class2;

public class ArithmeticOperations {

	public static void main(String[] args) {
/*
 * declare 2 variables and initialize them 
 * display result of addition, substraction, multiplication and division
 */
	int num1, num2;  //declare
	num1=20;		//initialize
	num2=10;
	
	System.out.println(num1+num2); //*
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	
	//how can we print value of num1 and num 2 together
	
	System.out.print(num1+" "+num2); //20 10
	
	
	//THIS WAY IS PREFFERED:
	int sum=num1+num2;  //*right to left assigning value to variable sum
	int sub=num1-num2;  //perform the operation, result will be new value, new						
	int mult=num1*num2; //value asssigned to new variable
	int div=num1/num2;
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	//the addition of 2 numbers is ___......
	System.out.println("The addition of 2 numbers is "+sum);
	System.out.println("The substraction of 2 numbers is "+sub);
	System.out.println("The mltiplication of 2 numbers is "+mult);
	System.out.println("The division of 2 numbers is "+div);
		
	}

}
