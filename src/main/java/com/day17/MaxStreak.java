package com.day17;

import java.util.Arrays;
import java.util.List;

public class MaxStreak {
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("YYY","YYY","YYY","YYY","YNY","YYY","YYY","YYY","YYY","YYY");
		int currentStreak=0;
		int maxStreak = 0;
		
		for(String curr : list) {
			if(!curr.contains("N")) {
				currentStreak++;
				maxStreak = Math.max(currentStreak, maxStreak);
			} else {
				currentStreak=0;
			}
		}
		System.out.println(maxStreak);
		
	}

}
