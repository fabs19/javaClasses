package com.Class14;

public class Task {

	public static void main(String[] args) {
		/*
		 1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 * 
		2. Create a String that should be combination of letters, numbers and special characters.
		 Find out how many alpha characters are there in the String.
		 
		3. You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		 How would you find out how many sentences are in that String?
	
		 */
		//1.
		String str="Today is Java Coding day";
		System.out.println(str.replace(" ", ""));
		
		//2.
		String str1="#$^&@!Hello&%$#@#";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]",""));
		String str3=str1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str3.length());
		
		//3.how many sentences are in the string?
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
			String [] array = str.split("//?");
	        for (int i=0; i<array.length; i++) {
	            System.out.println(array[i]);
	        }
	        
		
		
		
		
		
		
		
		
		
	//	System.out.println(str1.replaceAll("\\w",""));
		
	}

}
