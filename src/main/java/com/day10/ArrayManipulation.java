package com.day10;

import java.util.Arrays;

public class ArrayManipulation {
	
	public static void main(String[] args) {
		
		String [] inputArray = {"Sailesh","is","in","the","Interview"};
		System.out.println("Actual Array      : "+Arrays.toString(inputArray));
		String[] manipulation = manipulation(inputArray);
		System.out.println("Manipulated Array : "+Arrays.toString(manipulation));
		
	}

	private static String[] manipulation(String[] inputArray) {
		
		int left=1;
		int right=inputArray.length-2;
		String temp=null;
		
		while(left<right) {
			temp = inputArray[left];
			inputArray[left]=inputArray[right];
			inputArray[right]=temp;
			left++;
			right--;
		}
		
		return inputArray;
		
	}

}
