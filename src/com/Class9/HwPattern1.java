package com.Class9;

public class HwPattern1 {

	public static void main(String[] args) {
		/*
		1.Print the following pattern:
			55555   outer r:5  inner c:5
			4444
			333
			22
			1 
			the number of stars in each row is equal to max num of row
		*/ 

		for (int a = 5; a >= 1; a--) {//rows
            for (int b = 1; b <= a; b++) {//cols
                System.out.print(a);
            }
            System.out.println();
        }
    }
}


		
		
		
		
		
		
		
		
		
		





	
