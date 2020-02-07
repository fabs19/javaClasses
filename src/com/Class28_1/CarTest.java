package com.Class28_1;
/*
 * creating the object of the child class
passing three argument values
during the execution the specific constructor will be found
values will be passed and used to call parent class constructor 
parent class constructor local variables will be used to initialize 
the instance variables.once parent class constructer gets executed
goes back to the child class constructor and initializes child class 
instance variables then object got created.
now can execute the display method.
 */

public class CarTest {

	public static void main(String[] args) {
		
//		Tesla tesla=new Tesla();
		
		//add arguments to match constructor(String, String,Boolean)
		Tesla tesla1=new Tesla("Tesla", "S4", true);
		tesla1.displayInfo();
		System.out.println("----------Creating another object-------");
		//add arguments to match constructor
		Tesla tesla2=new Tesla("Tesla XL","S8", false);
		tesla2.displayInfo();
	}
	
	
	
	
	
	
	
	//ex. of how to unhardcode w/methods
	public void helloName(String name) {
		System.out.println("Hello"+name);
	}

}
