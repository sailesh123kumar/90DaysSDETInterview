package com.bonusquestion;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulationDay13 {

	public static void main(String[] args) {

		String input = "a1b2c3";
		

		List<Character> list = new ArrayList<Character>();
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char curr : charArray) {
			if (Character.isDigit(curr)) {
				list.add(curr);
			}
		}

		int index = list.size() - 1;
		System.out.println("List length : " + index);

		for (char curr : charArray) {
			if (Character.isDigit(curr)) {
				sb.append(list.get(index));
				index--;
			} else {
				sb.append(curr);
			}
		}
		System.out.println(input);
		System.out.println(sb.toString());

	}

}
