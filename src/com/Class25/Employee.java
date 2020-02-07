package com.Class25;
//Parent
public class Employee {

	int salary;// accesinle within package 
	public static String companyName; //common amoung all
	protected int employeeId;
	private String employeeSsn;//acces within same class
	
	void work() {
		System.out.println("I work in "+companyName+" company");
	}
	
	void getPaid(){
		System.out.println("I get paid "+salary);
	}
	
	
	
	
}
