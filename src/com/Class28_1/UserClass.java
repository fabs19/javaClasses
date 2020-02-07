package com.Class28_1;
/*class task 1
 *1.Write program: userClass  that has a constructor that initializes name and mobile number instance variables.
 *  Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
 *   Print users name, mobile number and address in userDetails method. Test your code.
 */

public class UserClass {

	String name;
	long mobileNumber;
	
	
	UserClass(String name, long mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	
}

class UserInfo extends UserClass{
	
	String userAddress;
	
	UserInfo(String name, long mobileNumber, String userAddress) {
		super(name, mobileNumber);
		this.userAddress=userAddress;
		
	}
	
	public void userDetails() {
		System.out.println(name+" "+mobileNumber+" "+userAddress);
	}
}
