package com.Class27;

public class TaskStudent {

	public void readsBooks() {
		System.out.println("Student reads books");
	}
	public void studies() {
		System.out.println("Student studies");
	}
	public void learns() {
		System.out.println("Student learns school subjects");
	}
class SyntaxStudent extends TaskStudent{
	
	public void noLife() {
		System.out.println("Syntax student has no life");
	}
	public void readsBooks() {
		System.out.println("Syntax student reads Java books.");
	}
}
class CollegeStudent extends TaskStudent{
	public void parties() {
		System.out.println("College student parties");
	}
	public void readsBooks() {
		System.out.println("College student reads a little");
	}
}
class SchoolStudent extends TaskStudent{
	public void hasCurfew() {
		System.out.println("School student has curfew");
	}
	public void readsBooks() {
		System.out.println("School student reads for fun");
	}
}
}