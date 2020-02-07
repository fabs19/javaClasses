package com.Class14;

public class Task {

	public static void main(String[] args) {
		
//		 * 1.Create a String that will hold a sentence. Write a program to get a new String WITHOUT any spaces.
		
		String b="I hold a sentence";
		System.out.println(b.replace(" ", ""));
		
		
		
		System.out.println("-----------------------------");
//		 * 2.Create a String that should be combination of letters, numbers and special characters.
//          Find out how many alpha characters(letters only) are there in the String.
	 
		String str1="%$#@!6889*&&Hello*&^3553%$#@!!!**9*";
		
		String str2=(str1.replaceAll("[^a-zA-Z]", ""));
		
		System.out.println(str2);
		
		System.out.println(str2.length());
		
		
		
		
			System.out.println("---------------------------------------------------------------------"); 
//		 * 3.You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
//		 *    How would you find out how many sentences are in that String?
		//.split returns an array of strings
		
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] splStr=a.split("\\?");
		System.out.println(splStr.length);
		
		//print all sentence from array:
		for (int i = 0; i < splStr.length; i++) {
			System.out.println(splStr[i]);
		}
		
		
		
			
		System.out.println("----------------------------------------------------");
//		 * 4.IQ Find number of words in string?
		
		String subject1="I love Java and I want to learn more";
		
		String [] strSplitd=subject1.split(" ");
		
		System.out.println(strSplitd.length);
		
		//print all words from string array:
		for(int i=0; i<strSplitd.length; i++) {
			System.out.println(strSplitd[i]);
		}
		
			
	}

}
