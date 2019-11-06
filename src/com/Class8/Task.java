package com.Class8;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//what is the output?
//				int sum=0;
//				for(int i=1; i<=5; i++){
//					sum=sum+i;
//					System.out.println(sum+ "+");
//				}
//				System.out.println();
//				System.out.println(sum);
//				
//				
//				
				System.out.println("*****************************");
				
				//what is the output
				int sumAll=0;
				
				for(int i=0; i<=20; i+=5) {  //i 0,5,15,20
					sumAll=sumAll+i;
				}
				System.out.println(sumAll);
				

				System.out.println("******************************");
				//what is the output?
				
				int total=2;
				
				for(int y=1; y<=3; y++) {
					total=total*y; 	//sum=increment value(int total=2)* y value
				}					//2=2*1; 4=2*2; 12=4*3
				System.out.println("total");
				
				
				System.out.println("++++++++++++++++++++++++++++++++++++");
				
				/*write a code to find the sum of even and odd numbers
				 * from range 1 to 20
				 * expecting 2 outputs:
				 * sum for odd nums=....
				 * sum for even nums=....
				 * 
				 * 2 outputs:the sum of even numbers: + sum
				 */
				
				
		//My way: fixit sumOdd not working should=100
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
				if (i % 2 != 0) {
					sumOdd = sumOdd + i;
				}
			}

		}

		System.out.println("sum for even: " + sumEven);
		System.out.println("sum for odd: " + sumOdd);

		System.out.println("********************");
		
		//Asels way:
		sumEven=0;
		sumOdd=0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}

		}
		System.out.println("The total of all even#=" + sumEven); //110
		System.out.println("The total of all odd#=" + sumOdd);   //100

	}
}