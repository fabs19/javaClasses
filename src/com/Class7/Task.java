package com.Class7;

public class Task {

	public static void main(String[] args) {
		/*Create a boolean variable workDay and assign true
         * create int variable day and assign it to 1
         * as long as it is a workDay print "I need a day off" and increase day
         * once day is 6 print "I do not need a day off any more"
         * controlling variable is workday
*/
		//my way:
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
			System.out.println("I need a day off");
			
			if (day == 6) {
				System.out.println("I do not need a day off anymore");
				workDay=false;
			}
			day ++;
		}
		
		
		
		//Asels other way:
//		while (workDay) {
//			
//			if (day == 6 || day == 7) {
//				workDay = false;
//				System.out.println("I do not need a day off anymore");
//			} else {
//				System.out.println("I need a day off");
//			}
//			day++;
//		}

		
		//Asels other way:
		
		while (workDay) {
            
            if (day==6) {
                workDay = false;
                System.out.println("I do not need a day off anymore");
                
            } else {
                System.out.println("I need a day off");
            }
            day++;
        }


		
		
		
	}

}
