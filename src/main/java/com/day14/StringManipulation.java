package com.day14;

public class StringManipulation {
	
	
	
	


	public static void main(String[] args) {
		String input = "s@ai56lesh Ku$%mar67";
		String result = stringManipulation(input);
		System.out.println(result);
	}

	private static String stringManipulation(String input) {
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		char[] charArray = input.toCharArray();
		
		for(char curr: charArray) {
			if(Character.isLetter(curr) || curr == ' ') {
				sb.append(curr);
			}else if (Character.isDigit(curr)) {
				sum = sum + Character.getNumericValue(curr);
			}
		}
		
		sb.append(sum);
		return sb.toString();
	}
	

}
