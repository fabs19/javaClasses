package com.Class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		//1.
		
		ArrayList<String> car=new ArrayList<String>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		System.out.println("------ First Way --------");
		for(String cars:car) {
			System.out.println(cars);
		}
		
		System.out.println("------ Second Way----------");
		for(int i=0; i<car.size(); i++){
			System.out.println(car.get(i));
		}
		
		System.out.println("----Third way--------------");
		Iterator<String> it=car.iterator();
		while(it.hasNext()) {
			System.out.println();
		}
	}

}
