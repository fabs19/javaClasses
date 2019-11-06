package com.Class9;

public class HwPattern2 {

	public static void main(String[] args) {
		
		/*
		2.Print the following pattern:
		*
		**
		***
		****
		*****
		****
		***
		**
		*
	*/

		for (int i = 1; i <= 5; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int y = 1; y <= i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
		
		

	
