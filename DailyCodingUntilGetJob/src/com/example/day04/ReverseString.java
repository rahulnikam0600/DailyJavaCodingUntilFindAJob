package com.example.day04;

/*
* Day 4
* Daily Java Coding Until I Find A Job
* Question = Reverse the given string without using inbuilt
* reverse or similar method
* String text = "Coding";
*/


public class ReverseString {

	public static void main(String[] args) {
		
		String text = "Coding";
		String result = "";
		
		for(int i = text.length()-1; i >= 0; i--) {
			result += text.charAt(i);			
		}
		
		System.out.println(result);
		
	}
	
}
