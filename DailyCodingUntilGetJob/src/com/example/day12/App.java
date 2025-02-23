package com.example.day12;

/*
 * Day 11
 * Daily Java Coding Until I Find A Job
 * Write a code to create employee class with id, name, salary. Add the 5000 bonus to each employee salary and sort the employee by there salary and if salary is equals then sort by name?
*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Rocky", 20000L),
				new Employee(102, "Raj", 30000L),
				new Employee(103, "John", 20000L),
				new Employee(104, "Mohan", 40000L),
				new Employee(105, "Vijay", 40000L),
				new Employee(106, "Pravin", 30000L),
				new Employee(107, "Sita", 30000L),
				new Employee(108, "Ravi", 40000L)
				);
		
		var result = employees.stream()
				.map(e -> {
					e.setSalary(e.getSalary()+5000);
					return e;
				})
				.sorted((e1, e2) -> {
					if(e1.getSalary().equals(e2.getSalary()))
						return e1.getName().compareTo(e2.getName());
					else {
						return e1.getSalary().compareTo(e2.getSalary());
					}
				})
				.collect(Collectors.toList());
		
		for (Employee employee : result) {
			System.out.println(employee);
		}
		
	}
	
}
