package com.Class26;

public class FullTime extends Employee {

	int bonus;
	
	public void getPaid() {
		System.out.println("Full time Employee gets paid "+salary+" and bonus "+bonus); //overriding method from Employee parent class
	}

}
