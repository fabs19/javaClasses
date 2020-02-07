package com.Class20;
/*
 *1. Create a method that will take 1 parameter as a String and return reversed String.
 *    Method should be visibly only within same package.
  2. Create a method that will take a String and return whether String is palindrome or not.
      Method should be available to all classes within your projects.
  3. Create a method that will take a string and return an array of words from that string.
   	  Method should be available only within same class.
 */

public class Task {

	protected String rev(String a) {
		String reverse = ""; 
	
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		return reverse;
	}
	
	
	
	public static void main(String[] args) {
		
		
		

	}

}
