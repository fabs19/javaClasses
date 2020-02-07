package com.Class28_1;
//class device, then create child class Apple
//automatic call-implicit.  not automatic manual create ur self-explicit
public class Device {

	String deviceType, name;    //instance variables
	
	public Device(String deviceType, String name) {    //defined constructor    						
		this.deviceType=deviceType;             //constructor initialize instance variables
		this.name=name;
	}	
}

class Apple extends Device{

	public Apple(String deviceType, String name) {   //forced to create explicitly
		super(deviceType, name);    //this will give initial values to parent variables deviceType, name
		
	}
	
}



 /*
  * you defined ur own paramwterized parent constructor thru which you are initializing parent class variables
  *  so now compiler will not create a default constructor. Complier will force you to create
  *  the constructor explicitly. Now when u create an object of bthe child class now thru the object creation 
  *  of the child class u can simply initialize ur parent class variables.
  */

