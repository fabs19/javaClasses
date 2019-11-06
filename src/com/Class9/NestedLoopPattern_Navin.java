package com.Class9;

public class NestedLoopPattern_Navin {

	public static void main(String[] args) {
		// LOGIC: Outer->R, Inner->C

	//1. Print Pattern
		  // C:4
		// * * * *
		// * * * *->R:4      
		// * * * *
		// * * * *
		
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	


