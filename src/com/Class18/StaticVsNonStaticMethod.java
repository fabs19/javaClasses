package com.Class18;

public class StaticVsNonStaticMethod {

	//Methods with Parameters in one class::

	public static void main(String[] args) {
		
		//we created an instance of the class bc the method is not static
		StaticVsNonStaticMethod obj=new StaticVsNonStaticMethod();
		obj.sum(20, 30);
		
		//we just use the methodName bc the method is static so don't need to create obj instance of class
		subtract(200,100);
	}
	
	
	
	
	

	public void sum(int x, int y) {
		System.out.println("The sum of x+y is:" + (x + y));
	}

	public static void subtract(int x,int y) {
		System.out.println("The diffrence of x-y is:" + (x - y));

	}

}// class
