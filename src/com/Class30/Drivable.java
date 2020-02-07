package com.Class30;
//can have methods(only abstract) and varibles(public static final)
//
public interface Drivable { //name as an adjective
	//public static final
	boolean DRIVE_FAST=true;  //constant variables uppercase naming convention preference
	
	
    //by default compiler will add public abstract
	void drive();  //unimplemented method by default its abstract
}

class Toyota implements Drivable {

	@Override
	public void drive() {
		System.out.println("Toyota can drive");

	}
}