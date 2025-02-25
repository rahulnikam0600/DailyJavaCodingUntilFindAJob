package com.example.day09;

/*
 * Day 9
 * Daily Java Coding Until I Find A Job
 * Print the duplicate values from array
 * Input: (1,4,6,7,8,9,4,5,4,2,2)
 * Output: 4 2
 *
*/

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

<<<<<<< HEAD

=======
>>>>>>> dev
public class App{
	
	public static void main(String args[]){
		
		List<Integer> numbers = Arrays.asList(1,4,6,7,8,9,4,5,4,2,1,2);
		
		numbers.stream()
<<<<<<< HEAD
			.filter(e -> Collections.frequency(numbers, e) > 1)
			.distinct()
			.forEach(e -> System.out.print(e + " "));
=======
			.filter(x -> Collections.frequency(numbers, x) > 1)
			.distinct()
			.forEach(r -> System.out.print(r+" "));
>>>>>>> dev
		
	}
	
}