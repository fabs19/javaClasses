package com.Class28_1;
//each class gets its own constructor bc constructor does not participate in inheritance
public class Car {
	//instance variables
	String make,model;  //super() gives initial values make=null, model=null
	
	Car(){				 
		System.out.println("I am a non argument constructor");
	}
	Car(String make,String model){//constructor local vars used to initialize parent  variables
		this.make=make;
		this.model=model;
	}
}//

class Tesla extends Car{
	
	boolean autopilot;        //instance features specific to Child
	
	Tesla(){  //invisible super() calls parent constructor
	//	super();//compiler will add by default,calls parent constructor gives initial value to the object
		System.out.println("I am a child non argument constructor");
	}
	
	//hardcoded
//	Tesla (boolean autopilot ){  //constructor initializing child instance variables
//		super("Tesla","S5");   //super();is added by default,HARDCODED values
//		this.autopilot=autopilot;
//	}
	
	//instead of hardcoding pass values in parameters
	Tesla (String make, String model, boolean autopilot ){  //Explicit constructor now not hardcoded
		super(make, model);   //super();added by default,passed variables used to call parent constructor
		this.autopilot=autopilot;
	}
	
	public void displayInfo() { //method perform behavior/functionality
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot );
	}
}