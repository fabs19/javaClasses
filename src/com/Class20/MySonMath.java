package com.Class20;

public class MySonMath {
	
	
	
	String name;

	void add1() {       // methods with no parameters and no result
		int num1=2;
		int num2=1;
		int result=num1+num2;
	}
	
	void add2(int num1, int num2) {//method w/parameters no return
		int result=num1+num2;
	}
	
	int add3() {  //method w/no parameters, yes return
		int num1=2;
		int num2=2;
		int result=num1+num2;
		return result;
	}
	
	int add4(int num1, int num2) {//method w/ parameter & return
		int result=num1+num2;
		return result;
	}
	
//	boolean checkResult(int myResult, int mySonResult){
//		boolean isOk=false;
//		
//		if(myResult==mySonResult) {
//			isOk=true;
//		}else {
//			isOk=false;
//		}
//		return isOk;
	}
	

