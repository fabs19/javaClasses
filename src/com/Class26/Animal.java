package com.Class26;

public class Animal {
	
	public void sleep() {
		System.out.println("Animal sleep");
	}
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Cat extends Animal{
	
	public void sleep() {
		System.out.println("Cats sleep all day");
	}
	public void meow() {
		System.out.println("I meow when I am hungry");
	}
}