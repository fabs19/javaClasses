package com.Class25;

public class ConstructorOverloading {
	//diff amount of parameters
	ConstructorOverloading(){
		System.out.println("I am non argument contructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am non argument constructor");
	}
	
	//having diff type of parameters
	ConstructorOverloading(int num){
		System.out.println("I am constructor with 1 int parameter");
	}
}
