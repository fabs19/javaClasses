package com.Class26;

public class RuntTimePolymorphism {

	public static void main(String[] args) {
		//creating an object of parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		//Creating an object of child class
		Cat cat=new Cat();
		cat.eat(); //parent
		cat.meow();// from child
		cat.sleep();// from child
		
		
		
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		
		//Non Primitve TypeCasting
		//Widening-> creating an object of the child class & giving the reference to the Parent class
		Animal obj=new Cat(); //
		
		//narrowing:
	//	Cat obj2=new Animal();--> Cannot convert from animal to Cat
	}

}
