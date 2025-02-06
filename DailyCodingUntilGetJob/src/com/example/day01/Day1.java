package com.example.day01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Day1 {
	public static void main(String[] args) {
		
		List<Integer> numbersIntegers = Arrays.asList(3,3,4,6,7,9);
		
		Optional<Integer> result =  numbersIntegers.stream()
			.max((e1,e2) -> e1.compareTo(e2));
		
		System.out.println(result.get());
		
	}
}
