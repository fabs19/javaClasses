package com.Class23;

public class ConstructorDemo {

	//non argument constructor
	ConstructorDemo(){
		System.out.println("I am your consructor");
	}
	ConstructorDemo(String str){
		System.out.println("I am constructor witht 1 String parameter "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am constructor witht 1 int parameter "+num);
	}
	ConstructorDemo(int num, int num1){
		System.out.println("I am constructor witht 2 int parameter "+num);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("Code after creating an object");
		obj.hello();
		ConstructorDemo obj2=new ConstructorDemo(123,456);
		

	}
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}

}
