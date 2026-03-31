package com.day8;

public class ReverseAString2 {

	public static void main(String[] args) {


		String input = "Hello";
		
		System.out.println("Original String");
		
		for(int i=0;i<input.length();i++) {
			System.out.print(input.charAt(i));
		}
		
		System.out.println("");
		System.out.println("Reversed String");
		
		for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
		
	}
}
