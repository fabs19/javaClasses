package com.Class24;

public class ThisKeyword {

	int a, b;
	
	public ThisKeyword(int a , int b) {
		this.a=a;
		this.b=b;
		
	}
	public void sum(int a, int b) {
		System.out.println("The sum of local parameters is "+(a+b));
		System.out.println("The sum of instance variables is "+(this.a+this.b));
	}
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA(); //inside method can call another method using this. Points out to current instance method
		sayB(); //compiler add this automatically-->this.sayB not preffered
	}
	
	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(5,10); //instance
		obj.sum(10, 20);  //local
		obj.sayAandB();
		obj.sayA();
		obj.sayB();
		
		
		ThisKeyword obj1=new ThisKeyword(20,20); //instance
		obj1.sum(100, 200); //local
	}
	
}
