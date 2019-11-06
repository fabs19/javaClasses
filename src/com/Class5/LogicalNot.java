package com.Class5;

public class LogicalNot {

	public static void main(String[] args) {
		// ! Reverts Condition

		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println();
		System.out.println();
		
		
		boolean traffic=false;
		//if traffic we are late-->, else-->on time
		if (!traffic) {  //using ! we are reverting condition  **common way
			System.out.println("on time");
		}else {
			System.out.println("late");
		}
		
		
		boolean isRain=false;    //****common way
		
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Don't not take umbrella");
		}
		
		
		//lets compare 2 numbers using Not operator
		
		int num1=10;
		int num2=11;
		
		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers not equal");
		}
		

		if (!(num1 == num2)) {								//****Common Way
			System.out.println("Numbers are NOT equal");
		}
		
		
		//if name is not Mary or Anna then you are not my sister
		String name="Mary";
		String name2="Anna";
		
		//    true OR false--> true   add NOT-->false
		if (!(name.equals("Mary")|| name2.equals("Anna"))) {
			System.out.println("you are not my sister");
		}else {
			System.out.println("you are my sister");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
