package com.Class27;
/*define a class card with 2 methods and this class should have 4
 * subclasses in which some behavior can be overridden and some can 
 */
public class Card {
	
	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}
	public void creditLimit() {    //OVERRIDDEN
		System.out.println("Credit limit of the card is 5000");
	}

}
class AX extends Card{
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the card is 25000");
	}
}
class MC extends Card{
	
}
class Visa extends Card{
	
}