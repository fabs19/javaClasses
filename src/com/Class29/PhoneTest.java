package com.Class29;

public class PhoneTest {

	public static void main(String[] args) {
		//You cannot create an object of an abstract class		
//		Phone phone=new Phone(); //cant bc this class only 50% defined
		
		//we can create it indirectly:
		Phone phone=new iPhone();//create obj of child class and refer to parent
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
	}

}
