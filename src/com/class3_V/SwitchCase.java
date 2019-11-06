package com.class3_V;

public class SwitchCase {
	//can use when you have multiple choice
	//how switchcase diffrent from if..else if..else?
	//if..else if..else executed only when the condition is true or false, executed based on the boolean value
	//Switch case is value based. if value of variable is equal to the diff case values then execute
	//Switch works with byte,short, char, int and String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weekDay=1;    //initializing variable
		
//		if (weekDay == 1) {
//			System.out.println("Today is Monday");
//		} else if (weekDay == 2) {
//			System.out.println("Today is Tuesday");
//		} else if (weekDay == 3) {
//			System.out.println("Today is Wednesday");
//		} else if (weekDay == 4) {
//			System.out.println("Today is Thursay");
//		} else if (weekDay == 5) {
//			System.out.println("Today is Friday");
//		} else if (weekDay == 6) {
//			System.out.println("Today is Saturday");
//		} else if (weekDay == 7) {
//			System.out.println("Today is Sunday");
//		} else {
//			System.out.println("Day is invalid");
//		}
		
		
		switch (weekDay) {
		
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Day is invalid");	
		}
			
		
		String country="USA";
		
		switch (country) {
		
		case "USA":
			System.out.println("You are an american");
			break;
		case "Russia":
			System.out.println("You are russian");
			break;
		case "Afghanistan":
			System.out.println("You are afghan");
			break;
		default:
			System.out.println("I dont know your nationality");
			
		
		}
			
			
		
		
		
		
		
		
	}

}
