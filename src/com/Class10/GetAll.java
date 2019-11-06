package com.Class10;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals= {"Cat","Dog", "Cow"," Snake", "Elephant"};
		//I want to print all values from an  array
		//when values is  Dog --> I love dogs
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.print(animals [i]);
			}
			
			
		}
		
		
	
	}
}
