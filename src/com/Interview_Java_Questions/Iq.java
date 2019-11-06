package com.Interview_Java_Questions;

public class Iq {

	public static void main(String[] args) {

		// 1. Write a program to ->swap 2 numbers without a temporary variable? 
				// 1.1 Swap  2 strings without a temporary variable?
				
				int a = 10;
				int b = 20;
				
				a = a + b; //30
				
				b = a - b; //30 - 20 = 10
				
				a = a - b; //30 - 10 = 20
				
				System.out.println("The value of a = "+a+" value of b = "+b);
				
				System.out.println("------------------------------------------");

				//1.1 Swap 2 strings: 
				
				String str1="Hello";	//5 length
				String str2="bye";    //7 length
				
				//a = a + b;
				//b = a.substring(0, a.length() - b.length());
				
				str1 = str1 + str2; 
			
				str2=str1.substring(0,str1.length()-str2.length());
				System.out.println(str2);
				System.out.println(str1);

				
			/*
			 * 2.Write a java program to find the second largest number in the array?
			 * Maximum and minimum number in the array?
			 */
				
				int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
				int largest = arr[0];
				int secondLargest = arr[0];
				
				System.out.println("The given array is:" );
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				for (int i = 0; i < arr.length; i++) {
		 
					if (arr[i] > largest) {
						secondLargest = largest;
						largest = arr[i];
		 
					} else if (arr[i] > secondLargest) {
						secondLargest = arr[i];
		 
					}
				}
		 
				System.out.println("\nSecond largest number is:" + secondLargest);
		 
				
				/*
				 *5.Write a java program to reverse String? 
				 * Reverse a string word by word?
				 */
				
				String reverse="";
				String original="Hello";
				int length = original.length();
			     
			      for (int i = length - 1 ; i >= 0 ; i--)
			       reverse = reverse + original.charAt(i);
			         
			      System.out.println("Reverse of the string: " + reverse);
			 
				//6.Write a Java Program to find whether a String is palindrome or not?
				
				
				/*
				 * A prime number is a whole number greater than 1 whose only 
				 * factors are 1 and itself. A factor is a whole numbers that
				 *  can be divided evenly into another number. 
				 *  The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
				 */
				
			      int num=23;
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			}//class

		}


























		//	str2 = str1.substring(0 , str1.length()-str2.length()); //Hello
			
		//	str1 = str1.substring(str2.length()); //World
			
		//	System.out.println("The value of str1 = "+str1+", value of str2 = "+str2);
			
			//
				
