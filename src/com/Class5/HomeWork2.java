package com.Class5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/* 1.Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
		if the average score >=90 → grade=A
		if the average score >= 70 and <90 → grade=B
		if the average score>=50 and <70 → grade=C
		if the average score<50 → grade=F
		*/
		
		
		Scanner scan;
		double quizScore, midtermScore,finalScore;
		double averageScore;
		String grade;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quizScore=scan.nextDouble();
		
		System.out.println("Please enter midterm score");
		midtermScore=scan.nextDouble();
		
		System.out.println("Please enter final score");
		finalScore=scan.nextDouble();
		
		averageScore=(quizScore+midtermScore+finalScore)/3;
		
		if(averageScore >=90) {
			grade="A";
			//System.out.println("grade A");
		}else if (averageScore >= 70 && averageScore<90 ) {
			grade="B";
			//System.out.println("grade B");
		}else if (averageScore>=50 && averageScore <70) {
			grade="C";
			//System.out.println("grade C");
		}else if (averageScore<50) {
			grade="F";
			//System.out.println("grade F");
		}else {
			grade="invalid";
			//System.out.println("invalid");
		}
		System.out.println("Based on inputs your average score is "+averageScore+" and grade is "+grade);
		
		
		System.out.println("#########################################################");
		
		
		/*Write a program to determine the classMode.
		 If there is no rain → classMode=“In Class”, otherwise classMode → “Online”.
		*/
		
		boolean isRain=true;
		String classMode1;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Is it raining outside (True/False)");
		isRain = scan1.hasNext(); 
		
		if(!isRain) {
			classMode1="In Class";
		}else {
			classMode1="Online";
		}
		System.out.println("Class today will be : "+classMode1);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
