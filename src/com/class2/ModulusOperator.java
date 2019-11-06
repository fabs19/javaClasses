package com.class2;

public class ModulusOperator {

	public static void main(String[] args) {
		
		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		System.out.println(div);
		
		//integer ignores remainder when dividing
		int number1=13;
		int number2=2;
		int divOfInt=number1/number2;
		System.out.println(divOfInt);
		
		double d=12;
		System.out.println(d);
		 
		//*TIP: use double or float when trying to divide
		
		//modulus gives remaining of the division:
		//remainder-whats left over from division
		
		int a=15;
		int b=2;
		
		int remainder=a%b;
		System.out.println(remainder);
		
		int myNumber=8+8*2;
		System.out.println(myNumber);
		
		
	}

}
