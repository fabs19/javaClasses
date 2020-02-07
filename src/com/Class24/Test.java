package com.Class24;

public class Test {

	public static void main(String[] args) {
		
		Child1 child1=new Child1();
		System.out.println(Child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Child2 child2=new Child2();
		System.out.println(Child2.race);// static can use Parent as well but now child2 has access to Parent class so use Class Child2
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.dance();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);//static variable access using the class name
		parent.sing();
		
	}

}
