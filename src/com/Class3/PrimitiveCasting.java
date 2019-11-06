package com.Class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//FYI
		double d=12;
		System.out.println(d);
		
//		what is casting? Trying to change a type to another type
		
		
		//	int i=12.0;  compile time error
		//Widening(Implicit/Automatic)casting  small->big
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//Narrowing(Explicit/Manual) casting big->small
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		
		
		/*For you to do:
		Declare 2 int variables and assign their values as 5 and 2. 
		Perform the division of these variables. 
		Print the decimal value of the division result. 

		Output:
		Result: 2.5
		 */	
		
		 int numb1=5;
		 int numb2=2;
		    
		    double div = (double)numb1/numb2;
		   
		   System.out.println("Result: "+div);	
		
	}

}
