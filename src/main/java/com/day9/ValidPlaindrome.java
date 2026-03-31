package com.day9;

public class ValidPlaindrome {
	
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
		
		int left=0;
		int right=input.length()-1;
		char[] charArray = input.toLowerCase().toCharArray();
		
		while(left<right) {
			
			while(left<right && !Character.isLetterOrDigit(charArray[left])) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(charArray[right])) {
				right--;
			}
			while(charArray[left]!=charArray[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
