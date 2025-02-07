package com.example.day05;

/*
* Day 5
* Daily Java Coding Until I Find A Job
* Question = Find the string is palindrome or not
* String text = "nayan";
*/


public class App {
	
	public static void main(String[] args) {
		
		String text =  "anayana";
		
		if(isPalindrome(text)) {
			System.out.println(text + " is Palindrome");
		}
		else {
			System.out.println(text + " is not Palindrome");
		}
		
	}
	
	public static boolean isPalindrome(String s) {
		
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		
		return true;
	}
	
}
