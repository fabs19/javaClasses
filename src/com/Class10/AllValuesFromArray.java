package com.Class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] grades= {'A','B','C','D','E','F'};
		//System.out.println(grades[0]);
		
	//	int a=2;
//		System.out.println(grades[4]);
//		System.out.println(grades[a]);
		
	//	a+=2;  //2+2
//		System.out.println(grades[a]);
//		a--;//3
//		System.out.println(grades[0]);
//		
		
	
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
		System.out.println("----------------------------------------");
		String[] animals= {"Cat","Dog", "Cow"," Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals [i]+" ");
		}
		
		
		System.out.println("-----------------------------------------");
		
		//create an array to store 5 double values, print all in 1 line
		
		double[] values= {1.0,1.2,1.3,1.4,1.5};
		double sizes=values.length;
		
		for(int i=0; i<sizes; i++) {
			System.out.print(values[i]+" ");
		}
		
		
		

	}

}
