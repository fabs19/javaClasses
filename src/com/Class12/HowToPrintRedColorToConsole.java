package com.Class12;

public class HowToPrintRedColorToConsole {

	public static void main(String[] args) {
		int a = 2;

		if (a == 20) {
			System.out.println("Number is " + a);
		} else {
			System.err.println("Number was not 20 but is " + a);
		}

	}

}