package com.Class9;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print pattern:
		
				// *      outer- r:5   c:5
				// **     cols have dependency on rows
				// ***    #rows can be less or equal to  # of rows but never greater
				// ****   # col cannot exceed # of rows
				// *****   cols can never be greater than rows
				
		for (int i = 1; i <= 5; i++) { // r
			
			for (int j = 1; j <= i; j++) { // c
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("*****************************************************************");
		
		//Print Pattern:
		
		// 1         outer r: 9   inner col:9
		// 22
		// 333
		// 4444
		// 55555
		// 666666
		// 7777777
		// 88888888
		// 999999999
		
		
		
		for (int i = 1; i <= 9; i++) { // r

			for (int j = 1; j <= i; j++) { // c

				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
	}

}
