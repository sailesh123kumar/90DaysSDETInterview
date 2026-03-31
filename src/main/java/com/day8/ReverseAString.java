package com.day8;

public class ReverseAString {

	public static void main(String[] args) {


		String input = "Hello";
		
		String result = reverseAStringUsing2Pointer(input);
		System.out.println(result);
		
	}

	private static String reverseAStringUsing2Pointer(String input) {

		int left=0;
		int right=input.length()-1;
		
		char[] charArray = input.toCharArray();
		char temp;
		while(left<right) {
			temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(charArray);
		
	}
}
