package com.Class22;

public class StaticVsNonStatic {
//template for a students(school, name,grade)
	
	static String school="Syntax"; 
	String name;
	char grade;
	
	//instance method
	void getInfo() {
		System.out.println("My name is "+name+" and I am going to "+school+" and my grade is "+grade);
	}
	//static method
	void getInfo1() {
		System.out.println("I am attending classes at "+school);
	}
	
	
}
