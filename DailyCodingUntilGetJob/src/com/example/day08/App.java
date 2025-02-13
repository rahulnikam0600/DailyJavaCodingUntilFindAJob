package com.example.day08;

/*
 * Day 8
 * Daily Java Coding Until I Find A Job
 * Print the duplicate values from array
 * Input: (1,4,6,7,8,9,4,5,4,2,2)
 * Output: 4 2
 *
*/

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class App{
	
	public static void main(String args[]){
		
		List<Integer> numbers = Arrays.asList(1,4,6,7,8,9,4,5,4,2,1,2);
		
		numbers.stream()
			.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() > 1)
			.map(Map.Entry::getKey)
			.forEach(r -> System.out.print(r+" "));
		
	}
	
}