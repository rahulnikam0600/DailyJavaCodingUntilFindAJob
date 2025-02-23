package com.example.day11;

/*
 * Day 11
 * Daily Java Coding Until I Find A Job
 * Find the Cube of given array and print the cubes which are greater than 50?
 * Input: List<Integers> numbers = Arrays.asList(3,6,4,5,1,2,7,8,9);
 * Output: 216 64 125 343 512 729
*/

import java.util.List;
import java.util.Arrays;

public class App{
	
	public static void main(String args[]){
		
		List<Integer> numbers = Arrays.asList(3,6,4,5,1,2,7,8,9);
		
		numbers.stream()
			.map(e -> e*e*e)
			.filter(e -> e > 50)
			.forEach(System.out::println);
			
	}
	
}