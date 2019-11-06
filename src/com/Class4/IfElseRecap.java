package com.Class4;

public class IfElseRecap {
	
	public static void main(String[] args) {

		/*Class schedule
		 * if tuesday-> today  is sdlc 2
		 * if wednesday --> java review
		 * if thursday --> sdlc
		 * if saturday --> Java coding
		 * if sunday --> my favorite Java coding
		 */
		
		//Ladder if statement
		
		int day=1;
		
		if(day==2) {
			System.out.println("SDLC");
		}else if(day==3) {
			System.out.println("Java Review");
		}else if (day==4) {
			System.out.println("SDLC Class");
		}else if (day==6) {
			System.out.println("Java Coding");
		}else if(day==7) {
			System.out.println("favorite Java Coding Class");
		}else {
			System.out.println("There is no class at school");
		}
		
		
		
		
		
		
	}
}
