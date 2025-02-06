package com.example.day02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day2 {
	
	public static void main(String[] args) {
		
		String text = "This is sample text. This text is just sample. Sample text has many words repeat.";
		
		List<String> words = Arrays.stream(text.split("\\W+"))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
				.entrySet()
				.stream()
				.sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
				.limit(3)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		System.out.print(words);
		
	}
	
}
