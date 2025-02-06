package com.example.day03;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		MyComparator comparator = new MyComparator();
		
		List<Employee> employees = Arrays.asList(
				new Employee(104, "Vijay", 40000L),
				new Employee(106, "John", 80000L),
				new Employee(103, "Mohan", 30000L),
				new Employee(107, "Raj", 60000L),
				new Employee(101, "Viky", 50000L)
				);
		
		employees.sort((e1,e2) -> comparator.compare(e1, e2) );
		
		System.out.println(employees);
		
	}
	
}
