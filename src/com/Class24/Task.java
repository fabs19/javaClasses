package com.Class24;

public class Task {
	
	int a;
	int b;
	String c;
	
	private Task() {
		System.out.println("I am private constructor");
	}
	protected Task(int a) {
		System.out.println("I am protected constructor");
	}
	public Task(int a, int b) {
		System.out.println("I am public constructor");
	}
	 Task(String c) {
		
		System.out.println("I am default constructor");
	}
	
	 
	public static void main(String[] args) {
		
		Task obj=new Task();
		Task obj1=new Task(5);
		Task obj2=new Task(7,8);
		Task obj3=new Task("Fabi");
		

	}

}
