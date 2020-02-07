package com.Class32;

public class WrapperClasses {
public static void main(String[] args) {
	
	int num=10;
	
	//Autoboxing-->converting primitve type into an object type
	Integer integer=10000;
	System.out.println(integer.MIN_VALUE);
	String str=integer.toString();
	System.out.println(str);
	//coverting boolean primitve type into Boolean object type
	Boolean bool=true;
	byte b=20;
	
	//AutoUnboxing
	int num1=new Integer(10);
	System.out.println(num1);
	
	
	
}
}
