package com.day28;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttingSolution {

	public static void main(String[] args) {

		int[] inputArr = { 1, 1, 3, 4 };

		Arrays.sort(inputArr);
		ArrayList<Integer> rodList = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int rod : inputArr) {
			rodList.add(rod);
		}

		while (!rodList.isEmpty()) {
			result.add(rodList.size());
			ArrayList<Integer> next = new ArrayList<Integer>();
			for (int rod : rodList) {
				int shortestLength = rodList.get(0);
				if (rod != shortestLength) {
					next.add(rod - shortestLength);
				}
			}
			rodList = next;
		}

		System.out.println(result);

	}

}
