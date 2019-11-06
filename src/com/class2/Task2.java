package com.class2;

public class Task2 {

	public static void main(String[] args) {
/*1.Write a Java program to add, subtract, multiply and divide 2 decimal values.
 *Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
 *  
2.Write a program to find the square of the number 3.9. 
You program should say “The square of the ____ is ____ “

3.Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
 */
		
	//1. 
	double dbl, dbl2;
	dbl=40.00;
	dbl2=10.00;
	
	double sum=dbl+dbl2;
	double sub=dbl-dbl2;
	double mult=dbl*dbl;
	double div=dbl/dbl2;
	 
	System.out.println("The sum of 2 numbers "+ dbl+" and "+dbl2+" is equal to "+ sum);
	
	//2.
	double square;
	square=3.9;
	double mult1=square*square;
	 System.out.println(square);
	
	 System.out.println("The square of the "+square+" is "+mult1);
		
	 
	//3.
	 int width=5;
	 int height=8;
	 int area=width*height;
	 System.out.println(area);
	 int perimeter=(width+width+height+height); //my way
   //int perimeter=2*(width+height)              ASELS WAY
	 System.out.println(perimeter);
	 System.out.println("The perimeter of a rectangle with width "+ width+" and height "+ height+" is equal to "+ perimeter+" and the area is "+area);
		
	 String message="The perimeter of a rectangle with width "+ width+" and height "+ height+" is equal to "+ perimeter+" and the area is "+area;
	 System.out.println(message);
	 
	 
	 
	}

}
