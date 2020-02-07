package com.Class25;
/*
 * Create a class named ‘Programming’. While creating an object of the class,
 *  if nothing is passed to it, then the message “I love programming languages” should be printed. 
 *  If some String is passed to it, then in place of “programming languages” the value variable should be printed.
 *   Example, if we pass “Java”, then “I love Java” should be printed.-
 */
public class ProgrammingTask {
	
	ProgrammingTask(){
		System.out.println("I love programming languages");
	}
	ProgrammingTask(String str){
		if(str.equals("Java")) {
			System.out.println("I love all programming languages");
		}else {
			System.out.println("I love Java");
		}
	}
		public static void main(String[] args) {
			
		
		ProgrammingTask obj=new ProgrammingTask ();
		ProgrammingTask obj1=new ProgrammingTask("String");
		
	}

}
