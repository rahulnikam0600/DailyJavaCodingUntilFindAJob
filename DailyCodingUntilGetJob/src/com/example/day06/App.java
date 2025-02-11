package com.example.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Day 6
 * Daily Java Coding Until I Find A Job
 * Read the elements from console and perform the expected operation
 * Input:
 * 5 				<- This represent the number of elements in array
 * 12 0 1 78 12 	<- This is the array provided
 * 2				<- Number of operations to be performed
 * Insert			<- Operation type
 * 4 23				<- First integer is index and second is element to be inserted.
 * Delete			<- Operation type
 * 0				<- Index of integer to perform operation
 * 
 * */


public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sizeOfArray = scanner.nextInt();
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < sizeOfArray; i++) {
			numbers.add(scanner.nextInt());
		}
		
		int noOfQueries = scanner.nextInt();
		
		for (int i = 0; i < noOfQueries; i++) {
			String query = scanner.next();
			if("Insert".equals(query)) {
				numbers.add(scanner.nextInt(), scanner.nextInt());
			}
			else if("Delete".equals(query)) {
				numbers.remove(scanner.nextInt());
			}
		}
		
		numbers.stream().forEach(e -> System.out.print(e + " "));
	}
	
}
