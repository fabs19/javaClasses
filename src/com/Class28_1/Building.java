package com.Class28_1;

public class Building {

	int floor;
	String address;

	//created parent constryctor initialzes own values
	Building(String address, int floor) {
		this.address = address;
		this.floor = floor;
	}
	//as soon as created ur own constructor ^ compiler NOt
	//gonna create one default for you.
	
	Building(){  //created nonargument constructor 
	//super();	
	}

}


/*
 * if you dont create non argument constructor then 
 *  cant give initial values to parent class variables bc 
 *  super() in child class wont have a default constructor
 *  in parent class to call to give those initial values.
 * 
 * if u dont create default constructor in parent class &
 * u only have a parameterized constructor in parent class
 * then in child class constructor u will be forced to 
 * call parameterized parent constructor by passsing all
 * the parameters to match parent parameterized constructor.
 * 
 * 
*/

