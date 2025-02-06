package com.example.day03;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getSalary().compareTo(e2.getSalary());
	}

}
