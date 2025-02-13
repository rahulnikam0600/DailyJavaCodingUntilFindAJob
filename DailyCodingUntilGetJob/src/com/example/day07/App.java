package com.example.day07;

/*
 * Day 7
 * Daily Java Coding Until I Find A Job
 * Find the first non repeating charactor from string
 * Input: "swiss"
 * Output: 'w'
 *
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class App{
	
	public static void main(String args[]){
		
		String text = "swissdkhgfkdwi";
		
		char result = findFirstNonRepeatChar(text);
		
		System.out.println(result);
		
	}
	
	public static char findFirstNonRepeatChar(String s){
		var charMap = new LinkedHashMap<Character, Integer>();
		
		for(char c: s.toCharArray()){
			charMap.put(c, charMap.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> e : charMap.entrySet()){
			if(e.getValue() == 1){
				return e.getKey();
			}
		}		
		return '\0';
	}
	
}