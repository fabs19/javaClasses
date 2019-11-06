package com.Class9;

import java.util.Scanner;

public class HwScanner3 {
	/*
	 * Write a program that reads a range of integers(start and end point) provided by a user
	 * and then from that range print the sum of even and odd integers
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();
        
        int start = 0;
        int end = 0;
        
        if (firstNumber < secondNumber) {
            start = firstNumber;
            end = secondNumber;
        } else {//assuming firstNumber is > secondNumber
            start = secondNumber;
            end = firstNumber;
        }
        
        int even = 0;
        int odd = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd = odd + i;
            }
        }
        System.out.println("The sum of even numbers is " + even);
        System.out.println("The sum of odd numbers is " + odd);
   // }
//}
        
        
        
        
		//second way:

//		Scanner scans = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int firstNumber = scans.nextInt();
//        System.out.println("Enter second number");
//        int secondNumber = scans.nextInt();
//        
//        int start = 0;
//        int end = 0;
//        
//        if (firstNumber < secondNumber) {
//            start = firstNumber;
//            end = secondNumber;
//        } else {//assuming firstNumber is > secondNumber
//            start = secondNumber;
//            end = firstNumber;
//        }
//        int even = 0;
//        int odd = 0;
//        for (int i = start; i <= end; i++) {
//            if (i % 2 == 0) {
//                even = even + i;
//            } else {
//                odd = odd + i;
//            }
//        }
//        System.out.println("The sum of even numbers is " + even);
//        System.out.println("The sum of odd numbers is " + odd);
    }
}
	


		
		
		
		
		

		 


