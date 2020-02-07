package com.Class25_1;

public class CanWeOverload {
	//can we overload a private method?-yes


	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	
	//Can we overload a main method?-yes
	//can we overload a static method?-yes, as main method is static
	
	public static void main (String str) {
		System.out.println("I am a main method with String arguments");
	}
	public static void main(String str, String[] arg) {
		System.out.println("I am main method with 2 parameters");
	}
	public static void main(String[] args) { //this executes first
		System.out.println("I am a main method with string array");
		CanWeOverload.main("String");
		String[]array= {"A","B"};
		main("Hello",array);
	}
	
}//c


	/*
	 * Create a class named ‘Programming’. While creating an object of the class,
	 *  if nothing is passed to it, then the message “I love programming languages” should be printed. 
	 *  If some String is passed to it, then in place of “programming languages” the value variable should be printed.
	 *   Example, if we pass “Java”, then “I love Java” should be printed.
	 */





