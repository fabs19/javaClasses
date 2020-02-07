package com.Class28_1;
//use super when parent class and child class has same variable name
//dont need super if in parent and hild class dont have same name
public class Child extends Parent{

	String name="james";
	
	public static void main(String[] args) {
		Child obj= new Child();
		obj.callName();
	}
	
	public void callName() {  //method to call name
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	
	public void callingMethod() {
		callName();// by default this is added- so we are calling current class method
		super.callName();
	}
}
