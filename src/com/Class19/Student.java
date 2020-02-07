package com.Class19;
/*
 * 3.Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	score > 90 - A
	score >80 - B
	score >70 - C
	score > 50 - D
	anything else - F
 */
public class Student {
	
		char getGrade(int score) {
			char sGrade;
			if(score>90) {
				sGrade='A';
			}else if(score>80) {
				sGrade='B';
			}else if(score>70) {
				sGrade='C';
			}else if(score>50) {
				sGrade='D';
			}else {
				sGrade='F';
			}
			return sGrade;
			
		}
	
	

	public static void main(String[] args) {
		
		Student obj=new Student();
		char gradestudent=obj.getGrade(91);
		System.out.println(gradestudent);

	}

}//class



