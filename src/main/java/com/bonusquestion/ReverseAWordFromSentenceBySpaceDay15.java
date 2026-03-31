package com.bonusquestion;

public class ReverseAWordFromSentenceBySpaceDay15 {
	
	public static void main(String[] args) {
		
		String input ="Java Test";
		stringManipulation(input);
		
	}

	private static void stringManipulation(String input) {
		String[] split = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word:split) {
			char[] charArray = twoPointerApproach(word);
			sb.append(charArray);
			sb.append(" ");
		}
		String result = sb.toString().trim();
		System.out.println(result);
	}

	private static char[] twoPointerApproach(String word) {
		char[] charArray = word.toCharArray();
		int left=0;
		int right = charArray.length-1;
		char temp;
		while(left<right) {
			temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		return charArray;
	}

}
