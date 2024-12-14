package com.java.collection;

import java.util.*;

public class SortSalary {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Aniket", 12, 60000));
		employee.add(new Employee("Amol", 13, 30000));
		employee.add(new Employee("Shivam", 11, 34000));
		employee.add(new Employee("Roshi", 15, 27000));
		employee.add(new Employee("Manthan", 14, 20000));

		Collections.sort(employee, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

		System.out.println(employee);

	}

}
