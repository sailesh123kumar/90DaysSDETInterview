package com.day25;

import java.util.Arrays;

public class JPMorganCoding {

	public static void main(String[] args) {

		int input[] = { 1, 3, 0, 4, 5, 0, 2, 0 };
		System.out.println(Arrays.toString(input));
		int index = 0;

		for (int num : input) {
			if (num != 0) {
				input[index] = num;
				index++;
			}
		}

		for (int i = index; i < input.length; i++) {
			input[i] = 0;
		}

		Arrays.sort(input, 0, index);
		System.out.println(Arrays.toString(input));

	}

}
