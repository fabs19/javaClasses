package com.Class18;

public class Task1 {
	//theses are non static methods in same class as main method::

	//1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void maxNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		} else if (num1<num2) {
			System.out.println(num2 + " is Larger");
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	 //2.Create a method that will take a number and prints whether the number is even or odd.
	
	void evenOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is even");
		} else {
			System.out.println(num1 + " is odd");
		}
	}
	
	 //3.Create a method that will print whether given String is palindrome or not.
	
		void isPalindrome(String original,String reversed) {
			
			for (int i = original.length() - 1; i >= 0; i--) {
				reversed = reversed + original.charAt(i);
			}

			System.out.println(reversed);

			if (original.equals(reversed)) {
				System.out.println("String is palindrome");
			} else {
				System.out.println("String is NOT palindrome");
			}
		}
	

	
	
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.maxNumber(8, 10);
		obj.evenOdd(3);
		obj.isPalindrome("mom", "");


		

         

		 

	}//

}
