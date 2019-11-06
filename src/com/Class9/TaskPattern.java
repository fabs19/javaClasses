package com.Class9;

public class TaskPattern {

	public static void main(String[] args) {
		/*
		 * 123456789    //--> Rows:5    Cols:9
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------------");
		
		/* 54321
		 * 54321   //R:5  C:5
		 * 54321
		 * 54321
		 * 54321
		 * 
		 */
		
//		for(int i=1; i<5; i--) {
//			for(int k=5; i>=1; i--) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
//	
//		
//		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		/* 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		 
		for (int i=5; i>0; i--) {
			for( int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		//Print pattern:
		
		// *      outer- r:5   c:5
		// **     cols have dependency on rows
		// ***    #rows can be less or equal to  # of rows but never greater
		// ****   # col cannot exceed # of rows
		// *****   cols can never be greater than rows
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
