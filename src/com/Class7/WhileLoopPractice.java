package com.Class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		//print values from 50 to 20

//		int y=50;
//		
//		while(y>=20) {
//			System.out.println(y);
//			y--;
//		}
		
		System.out.println("-------------------------------------");
		
		
		
//		1st way using increment:
		
//		int z=2;
//		while(z<=20) {
//			System.out.println(z);
//			z+=2;
//		}

		//2nd way using modulus:
		 
		int q = 1;
		
		while (q <= 20) {
			if (q % 2 == 0) {
				System.out.println(q);
				
			}
			q++; //outside if and inside while loop

		}
		
		
		
		
		
		
		

	}

}
