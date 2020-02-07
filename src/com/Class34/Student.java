package com.Class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//check answer
public class Student {
	
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		/*
		 * 3. Create a Set collection that will hold Objects of  Student  Type. 
		 * In  this  set  we  do  not  care about the insertion order. -->HashSet
		 * Each student object should  have  name  and  studentID. 
		 * Display name of each student.
		 *       
		 */
		 Set<Student>hset=new HashSet<>();
		 hset.add(new Student("Fabi", 101));
		 hset.add(new Student("Cindy", 102));
		 hset.add(new Student("Aegon", 103));
		 hset.add(new Student("Agi", 104));
		 hset.add(new Student("Oni", 105));
		 
		 System.out.println("-------------advanced loop----------");
		 for (Student element : hset) {
			 System.out.println(element.name);	
		}
		 System.out.println("--------iterator---------------");
		 Iterator<Student>itr=hset.iterator();
		 while(itr.hasNext()) {
			System.out.println(itr.next().name);
		 }
		 
	}

}
