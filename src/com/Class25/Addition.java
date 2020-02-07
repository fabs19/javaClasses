package com.Class25;

public class Addition {
	//Method Overloaoding:
	//1.by passing diffrent amounts of parameters
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
//	public int add(int num1, int num2) {
//		return num1+num2
//	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	//2 by having diff types of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public double add(int num1, double num2) {
		double sum=num1+num2;
		return sum;
		//System.out.println(num1+num2);
	}
	public void add( double num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		Addition obj=new Addition();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		obj.add(12.09, 12.10);
		
		String str="Hello";
		str.substring(3);
		str.substring(1, 3);
		
		
		
	}
	
	
}
