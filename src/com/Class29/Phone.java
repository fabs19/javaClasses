package com.Class29;

public abstract class Phone { //when u have unimplemented abstract method must make class abstract
	   //implemented method has body
		public void makeCall() {
			System.out.println("Make call");
		}
		public void sendText() {
			System.out.println("Send text");
		}
		
		//unimplemented method: must use abstract keyword
		public abstract void takePictures();
		
		public abstract void playGames();
		
}
//Concrete class- child class of abstract class that provides complete implementation 
//of all unimplemented methods from parent class.
class iPhone extends Phone{ //providing implementation of unimplemented methods from parent
	
	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}
	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
	}
}

class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Samsung");
		
	}
	
}