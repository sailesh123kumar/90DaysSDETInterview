package com.day24;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAnArray {

	public static void main(String[] args) {

		int input[] = { 10, 20, 30, 10, 40, 50, 30 };
		Set<Integer> numSet = new HashSet<Integer>();
		for (int num : input) {
			if (!numSet.add(num)) {
				System.out.println("Duplicate number is : " + num);
			}
		}

	}

}
