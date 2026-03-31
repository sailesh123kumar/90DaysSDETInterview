package com.day11;

public class EvenOrOddWithoutModulus {
	
	public static void main(String[] args) {
		
		int num=6;
		int num1=5;
		
		evenOrOdd(num);
		evenOrOdd(num1);
		
	}

	private static void evenOrOdd(int num) {

		while(num>1) {
			num=num-2;
		}
		System.out.println(num);
		if(num ==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}

}
