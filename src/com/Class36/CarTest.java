package com.Class36;
//create a car class that will have variables, methods and constructor
//create a map that will hold car numbers(1st car, 2nd car, etc) and car objects store in it

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car{
	
	String make, model;  //instance
	
	public Car(String make, String model) {   //constructor
		this.make=make;
		this.model=model;
		
	}
	
	public void display() {
		System.out.println(make+" "+model);
	}	
}


public class CarTest {

	public static void main(String[] args) {
		
		Map<Integer,Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X5"));   //new object
		mapCar.put(2, new Car("Tesla","S")); 
		mapCar.put(3, new Car("Mercedes","S5")); 
		mapCar.put(4, new Car("Toyota","Rav4")); 
		mapCar.put(5, new Car("Honda","Civic")); 
		mapCar.put(2, new Car("Lincoln","Mkc")); 
		
//		System.out.println(mapCar.size());
		
		
		//display only value objects:
		Collection<Car>coll=mapCar.values();
		//display make of each car
		for(Car c: coll) {
			System.out.println(c.make+"--"+c.model);
			c.display();
		}
		
		//map key to its corresponding values-> (entrySet or keySet)
		//1.using entrySet
		Set<Entry<Integer,Car>> set=mapCar.entrySet();
		//for each Loop
		for(Entry<Integer,Car> ent:set) {
		Integer i=ent.getKey();
		Car c=ent.getValue(); //c variable refers to object
		System.out.println("Key "+i +" is associated with value of "+c.make);
		}
		
		//2.using keySet to map keys to values
		
		Set<Integer> keySet=mapCar.keySet();
		System.out.println("-------for each loop----------");
		for (Integer key : keySet) {
			             // Integer+map Object-->value object(car type)
		//	System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+car.model;
			System.out.println(key+"="+carDetails);
		}
		
		//?use iterator to iterate thru values thru keySet, entrySet.
//		System.out.println("--------iterator key set----------");
//		Iterator<Integer>itr=mapCar.keySet().iterator();
//		while(itr.hasNext()) {
//			Integer itKey=itr.next();
//			Car car=mapCar.get(itKey);
//			System.out.println(itKey+" "+car);
//		}
//		
//		  Iterator<Entry<Integer, Car>> carIterator=carEntrySet.iterator();
//	        while(carIterator.hasNext()) {
//	            Entry<Integer, Car> entry=carIterator.next();
//	            Integer i=entry.getKey();
//	            Car car=entry.getValue();
//	            System.out.print(i+":");
//	            car.display();
//	        }

	}

}
