package com.Class3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);  //t
		System.out.println(num1<num2); //f
		System.out.println("*****************************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b5 = d>d1;
		System.out.println(b5); //false
		boolean b1 = d<d1;
		boolean b2=d1==d1;
		boolean b3=d!=d1;
		System.out.println(b1);  //t
		System.out.println(b2);  //f
		System.out.println(b3);  //t
		System.out.println("########################");
		
		
		//if number a is bigger than number b
		//I want to print a is larger than b
		int a=90;
		int b=30;
		
		if(a>b) {
			System.out.println("a is larger than b");
		}else{
			System.out.println("a is smaller than b");
		}
		
		
		//if expected hours are more than actual ->you will succeed
		//otherwise, please study more
		
		int expectedHours=15;
		int actualHours=20;
		
		if (actualHours>expectedHours) {
			System.out.println("You will succeed");
		} else {
			System.out.println("Please study more");
		}
		System.out.println("#####");
		
		//if price is more than i can afford i will not buy
		//if price is less or mtches what i can afford then I will buy tea
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;  //2.99=4.99-2
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
		}else {
			System.out.println("I cannot afford");
			System.out.println("I will go back and study more");
		}
		System.out.println("I keep writing some code");
		
		
		
		
		boolean val=true;
		
		if(val) {  //if val==true
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		 
		
		//if it is raining I will take umbrella, otherwise I will go for a walk
		
		boolean isRain=false;
		
		if(isRain) {  //isRain==true
			System.out.println("I will take umbrella");
		}else {
			System.out.println("I will go for walk");
		}
		
		
		
		
		
		
		
		
	}

}
