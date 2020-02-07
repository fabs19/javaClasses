package com.Class28;

public class Room extends Building{

	int roomNumber;
	//I have a non argument constructor in parent class:
//	Room(int roomNumber){
//		//super(); constructor call to get inital values to parent non argument constructor
//		
//		this.roomNumber=roomNumber;
//	}
	
	//if u dont create non argument constructor in parent class you will be enforced to pass the values ur self:
	Room(String address, int floor, int roomNumber){
		super(address,floor);
		this.roomNumber=roomNumber;
	}
	public void print() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	
	public static void main(String[] args) {
//		Room room=new Room(101);  // u must pass argument
		//System.out.println(room.floor);
		
		Room room=new Room("121 Test Driver",10,101);//start here match 
		room.print();
	}
	
	
}
