package com.example.day04;

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
