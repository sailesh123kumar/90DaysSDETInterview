package com.day2;

public class Person {
	
	private String name;
	
	Person(){
		System.out.println("Default Constructor");
	}
	
	
	//Parameterized constructor - Constructor Chaining
	Person(String name){
		this();
		this.name= name;
		System.out.println("Parameterized Constructor");
	}
	
	//Copy Constructor - Deep Copy - Constructor chaining
	Person(Person ref){
		this("jatin");
		this.name=ref.name;
		System.out.println("Copy Constructor");
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

	
}
