package com.day26;

import java.util.Arrays;

public class MinimumCharacterReplacementInAString {

	public static void main(String[] args) {

		String data[] = { "ab", "aab", "abb", "abab", "abaaaba" };
		int result[] = new int[data.length];

		for (int i = 0; i < data.length; i++) {
			String word = data[i];
			int count = 0;
			int index = 1;
			while (index < word.length()) {
				if (word.charAt(index) == word.charAt(index - 1)) {
					count = count + 1;
					index = index + 2;
				} else {
					index = index + 1;
				}
				result[i]=count;
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
