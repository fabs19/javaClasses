package com.Class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*ask user to enter age
		 * if age is from 1 to 3--> you are a baby
		 * if age is from 3 to 5--> you are a toddler
		 * if age is from 5 to 12--> you are a kid
		 * if age is from 12 to 19--> you are a teenager
		 * if age >20--> you are a adult
		 */

		//int age;
		//Scanner scan;
		//scan=new Scanner(System.in);
		//System.out.println("Please enter your age");  //**can do this way too
		//age=scan.nextInt();
		//(if age>=1 && age <=3);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter age");
		int age=input.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println("you are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("you are a toddler");
		}else if (age>5 && age <=12) {
			System.out.println("you are a kid");
		}else if (age>12 && age<=19) {
			System.out.println("you are teenager");
		}else if(age>19) {
			System.out.println("you are an adult");
		}else {
			System.out.println("Invalid age");
		}
		
		
		
		
		
		
	}

}
