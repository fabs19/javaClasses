package com.Class5;

public class LogicalOr {

	public static void main(String[] args) {
		//7 days a week
		//if says is 2 or 4--> SDLC  class
		//is day 6 or 7-->Java Class
		//if day 1 or 5--> No class
		//if day=3--> review class
		
		
//		int day=6;
//		
//		if(day==2|| day==4) {
//			System.out.println("SDLC class");
//		}else if (day==6 || day==7) {
//			System.out.println("Java class");
//		}else if(day==1 || day==5) {
//			System.out.println("No class");
//		}else if(day==3) {
//			System.out.println("review class");
//		}else {
//			System.out.println("Not a valid day");
//		}
		
		System.out.println("*****************************************");
		
		
		//7 days a week
				//if says is Tuesday or Thursday--> SDLC  class
				//is day saturday or sunday-->Java Class
				//if day monday or friday--> No class
				//if day is wednesday--> review class
				
		String weekDay="Sunday";
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")){
			System.out.println("SDLC class");
		} else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")){
			System.out.println("Java Class");
		} else if(weekDay.equals("Monday") || weekDay.equals("Friday")){
			System.out.println("No Class");
		}else if(weekDay.equals("Wednesday")){
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}

		
		
	}

}
