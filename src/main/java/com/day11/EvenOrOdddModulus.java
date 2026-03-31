package com.day11;

public class EvenOrOdddModulus {

	public static void main(String[] args) {

		int num = 12;
		int num1 = 11;
		evenOrOdd(num);
		evenOrOdd(num1);

	}

	private static void evenOrOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("Number is Even " + num);
		} else {
			System.out.println("Number is Odd " + num);
		}

	}

}
