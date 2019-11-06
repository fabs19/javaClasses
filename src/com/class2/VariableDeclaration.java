package com.class2;

public class VariableDeclaration {
	
	public static void main(String[] args) {

		//declaring variable num1 that will hold value of int and
		//assigning/initializing value of 123 to it
		int num1=123;
		int num2=6767;
		int num3=786876;
		
		//declaring the variable first (java i will need this box, and its empty now)
		int n1;
		int n2;					//*Declaration happens only once
		int n3;
		
		//assigning value
		n1=5;					
		n2=7676;
		n3=767;
		
		//3.Declare all variable together and then assign value :works if variables all of same type.
		int number1, number2, number3;
		//and later assign the value
		number1=12;
		number2=15;
		number3=676;
		System.out.println(number3); //assigned value of 676
		
		number3=1000;
		System.out.println(number3); //Reassigned value of variable
		
		boolean var=true;
		System.out.println(var);
		
		
		char myVariable='*';
		System.out.println(myVariable);
		
		number2=number1;//12 reassigned 15 to 12
		System.out.println(number2); //12 reassigned
		
		//number2=false;-->compile time error asking to change datatype of
		//variable  number2 to boolean
		
		//value of variable can change, declaration only once
		
		
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain; //isSnow=false
		System.out.println(isSnow);  //false
		isSnow=true;
		System.out.println(isSnow);  //true
		
	}
}
