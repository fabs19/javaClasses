package com.Class26;
/*
 * Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”. Class ‘Degree’ has two subclasses
 *  namely ‘Undergraduate’ and ‘Postgraduate’ each having a method with the same name that prints “I am an Undergraduate” 
 *  and “I am a Postgraduate” respectively. Call the method by creating an object of each of the three classes.
 */
public class DegreeTest {

	public static void main(String[] args) {
		
		Undergraduate obj=new Undergraduate();
		obj.getDegree();//overriden from parent class
		
		Postgraduate obj1=new Postgraduate();
		obj1.getDegree(); //overriden from parent class
		
		Degree obj2=new Degree();
		obj2.getDegree();   //overriding this is from parent class
		}

	}


