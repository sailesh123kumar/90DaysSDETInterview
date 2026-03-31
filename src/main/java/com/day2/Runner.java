package com.day2;

public class Runner {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);
		System.out.println("");
		
		Person p2 = new Person("Sailesh");
		System.out.println(p2);
		System.out.println("");
		
		Person p3 = new Person(p2);
		System.out.println(p3);
		
	}

}
