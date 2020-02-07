package com.Class31;
/*
 * Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
 *  Create 2 child classes: Circle & Square that should have an implementation of area and perimeter
 *   calculation.
 *   Test your code.
 */
public interface Shape {
	
	public void calculateArea();
	public void calculatePerimeter();

}
class Circle implements Shape{

	@Override
	public void calculateArea() {
		double radius=1;
		double area=3.14*radius*radius;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("circle has no perimeter");
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea() {
		int a=1;
		int area=a*a;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter() {
		int a=1;
		int p=4*a;
		System.out.println(p);
		
	}
	
}
