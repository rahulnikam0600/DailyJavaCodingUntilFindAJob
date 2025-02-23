package com.example.day10;

/*
 * Day 10
 * Daily Java Coding Until I Find A Job
 * Find the Duplicates from below list of string?
 * Input: List<String> words = Arrays.asList("AA", "BB", "CC","AA");
 * Output: AA
 *
*/

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class App{
	
	public static void main(String args[]){
		
		List<String> words = Arrays.asList("AA", "BB", "CC","AA");
		
		words.stream()
			.filter(e -> Collections.frequency(words, e) > 1)
			.distinct()
			.forEach(System.out::println);
		
	}
	
}

