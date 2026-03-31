package com.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulation {
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,22,32,null,123,100);
		
		List<Integer> nonNullList = integerList.stream()
					.filter(ele -> Objects.nonNull(ele))
					.collect(Collectors.toList());
		
		System.out.println(nonNullList);
		
		List<Integer> resultList = nonNullList.stream()
		.filter(ele -> String.valueOf(ele).startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println(resultList);
		
	}

}
