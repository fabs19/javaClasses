package com.Class35;

import java.util.*;

public class Student {
	
	String name;
	int studentId;
	
	Student(String name, int studentId){
		this.name=name;
		this.studentId=studentId;
	}

	public static void main(String[] args) {
		/*
		 * 3. Create a Set collection that will hold Objects of the Student Type. In
		 * this set we do not care about the insertion order. Each student object should
		 * have name and studentID. Display name of each student.
		 */

		Set<Student>hset=new HashSet<>();
		hset.add(new Student("Dani", 101));
		hset.add(new Student("John",102));
		hset.add(new Student("Sansa",103));
		hset.add(new Student("Arya",104));
		hset.add(new Student("Brianne",105));
		
		//1.
		System.out.println("--------advanced loop------");
		for(Student element:hset) {
			System.out.println(element.name);
		}
		
		//2.
		System.out.println("------Iterator-------------");
		Iterator <Student>itr=hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}
		
		
	}
}
