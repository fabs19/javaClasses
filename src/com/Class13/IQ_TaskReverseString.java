package com.Class13;

public class IQ_TaskReverseString {//TASK 2

	public static void main(String[] args) {
		/*
		 *1. Create a String and print it in reverse order (Sunday → yadnuS).
		 *
		   2.Create a String and if the String is not empty perform the following: 
           if the String has an odd number of characters and has 3 or more characters, 
           print the character in the middle of the String.
		 */

		
		String day="Sunday";
		
		for(int i=day.length()-1; i>=0;i--) {
			System.out.println(day.charAt(i));
		}
		 
//		for (int i = 5; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//
//		}
		
		
		
		//2.
		
		String str1="Monday";
		
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0) {
				
			}
		}
		
		
		
		
		
		
	}//class
}
