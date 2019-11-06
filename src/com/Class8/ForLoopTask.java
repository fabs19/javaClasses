package com.Class8;

public class ForLoopTask {

	public static void main(String[] args) {
		//1. Print numbers from 1 to 100 in 1 line with space
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		//2. Print numbers from 100 to 1
		
		for(int a=101; a>=1; a--) {
			System.out.println(a);
		}
		
		System.out.println("*******************************");
		
	//	3. Print even numbers from 20 to 1(2 ways)
		//First way
		for(int b=20; b>=1; b-=2 ) {
			System.out.println(b);
		}
		System.out.println("###################");
		//Second way
		for(int b=20; b>=1; b--) {
			if(b%2==0) {
				System.out.println(b);
			}
		}
		
		System.out.println("*************************");
		
		//4. Print odd numbers between 20 and 50( 2ways)
		//first way
		for(int c=21 ; c<=50; c+=2) {
			System.out.println(c);
		}
		System.out.println("###########################");
		
		//second way
		for(int c=20; c<=50; c++) {
			if(c%2!=0) {
				System.out.println(c);
			}
		}
		
		
		System.out.println("******************************");
		
		
		//what is the output?
		int sum=0;
		for(int i=1; i<=5; i++){
			sum=sum+i;
			System.out.println(sum+"+");
		}
		System.out.println();
		System.out.println(sum);
		
		
		
		System.out.println("*****************************");
		
		//what is the output
		int sumAll=0;
		
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("**********************");
		//what is the output
		int total=2;
		
		for(int y=1; y<=3; y++) {
			total=total*y; //2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total);
		
		
		

	}

}
