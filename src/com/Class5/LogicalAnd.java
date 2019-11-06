package com.Class5;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if number is between 1-10  this number is small
		 * if number is between 10-100  this number is medium
		 * if number is between 100-1000  this number is large
		 * any other number is out of range
		 */

		
		int num=200;
		
		if (num>1 && num<10) {   //true And false->false
			System.out.println(" this number is small");
		}else if (num>=10 && num<100) {  //true And false->false
			System.out.println("this number is medium");
		}else if(num>=100 && num<1000) {  //true And true->true
			System.out.println("this number is large");
		}else {
			System.out.println("number is out of range");
		}
		
		
		
		
	}

}
