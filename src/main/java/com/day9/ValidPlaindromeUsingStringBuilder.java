package com.day9;

public class ValidPlaindromeUsingStringBuilder {
	
	public static void main(String[] args) {
		String input="M$*adam_@";
		
		boolean flag = isPalindrome(input);
		if(flag) {
			System.out.println("Valid Plaindrome");
		}else {
			System.out.println("Not a Plaindrome");
		}
	}

	private static boolean isPalindrome(String input) {
		char[] array = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char cur : array) {
			if(Character.isLetterOrDigit(cur)) {
				sb.append(Character.toLowerCase(cur));
			}
		}
		
		String cleanedString = sb.toString();
		String reversedString = sb.reverse().toString();
		
		if(reversedString.equals(cleanedString)) {
			return true;
		}
		return false;
	}

}
