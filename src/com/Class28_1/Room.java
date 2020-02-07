package com.Class28_1;

public class Room extends Building{

	int roomNumber;      //own child feature
	
	//childs constructor child must initialize own features/variables
	Room(String address, int floor, int roomNumber){   
		super(address,floor); //by default compiler call parent non argument constructor to give initial values to parent class variables floor=0, adress=null          
		this.roomNumber=roomNumber;
	}
	
	public void print() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	
	public static void main(String[] args) {
		Room room=new Room("121 Test Drive", 10, 101);  //creating obj of child class
		room.print();
	}
	
}


/*
 * when u create ur  own constructor compiler does not create one for you.
 * when u calling ur own constructor u must initialize ur own variables
 *as a chilld class want to access parent class variables but before 
 *accesing them those variables must hhave their initial value. The parent
 *class non argument constructor gives them that initial value.
 *how? thru the child class constructor by default compiler is calling that non 
 *argument constructor.
 *






 * 
 */
