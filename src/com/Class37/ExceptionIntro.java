package com.Class37;

public class ExceptionIntro {

	public static void main(String[] args) {

		try {
			int a = 20;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			System.out.println("Code after an exception");
			System.out.println("Continues code");
		}
		
		int[] array= {10,20,30};
		System.out.println(array[3]);

	}//
}//c