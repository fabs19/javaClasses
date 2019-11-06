package com.Class3;

public class DoubleComparisonTask {

	public static void main(String[] args) {
		
		
/*1.Create a Java program and name it Double Comparison. 
 * Declare 2 double values and if value of first variable is higher then print “Double value __ is larger than __ .” 
 * Otherwise print...
 */

		double num1=20.00;
		double num2=10.00;
		
		if(num1>num2) {
			System.out.println("Double value " +num1+" is larger than "+num2);
		}else {
			System.out.println("Double value " +num1+" is smaller than "+num2);
		}
		
		
/*Create a Java program and name it Temperature Check. Create variable to store temperature.
 * Your program should check if temperature is below 32 then it should print
 *  “Water will freeze with temperature __”, otherwise “Water will NOT freeze with temperature __”.
 */
		
		 
		int temp1=33;
		int tempCheck=32; //temp check
			
		if(temp1<tempCheck) {
			System.out.println("Water will freeze with temperature"+tempCheck);
		}else {
			System.out.println("Water will not freeze with "+temp1);
		}
		
		
	}

}
