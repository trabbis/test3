package com.travis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Codility06 {

	/**
	 * Employee sorting problem
	 * 
	 * Description:
	 * Sort employees based on three criteria, in order of precedence:
	 * 1. salary in descending order
	 * 2. years of experience in descending order
	 * 3. name in ascending order
	 */
	
	/**
	 * Employee class with name, salary, and years of experience
	 */
	static class Employee {
		String name;
		int salary;
		int yearsOfExperience;
		
		public Employee(String name, int salary, int yearsOfExperience) {
			this.name = name;
			this.salary = salary;
			this.yearsOfExperience = yearsOfExperience;
		}
		
		@Override
		public String toString() {
			return name + "(" + (salary / 1000) + "K," + yearsOfExperience + ")";
		}
	}
	
	/**
	 * Sort employees according to the specified criteria:
	 * 1. Salary (descending)
	 * 2. Years of experience (descending)
	 * 3. Name (ascending)
	 * 
	 * @param employees list of employees to sort
	 * @return sorted list of employees
	 */
	public static List<Employee> sortEmployees(List<Employee> employees) {
		// Create a copy to avoid modifying the original list
		List<Employee> sorted = new ArrayList<>(employees);
		
		Collections.sort(sorted, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				// 1. Compare by salary (descending)
				if (e1.salary != e2.salary) {
					return Integer.compare(e2.salary, e1.salary); // Descending order
				}
				
				// 2. If salaries are equal, compare by years of experience (descending)
				if (e1.yearsOfExperience != e2.yearsOfExperience) {
					return Integer.compare(e2.yearsOfExperience, e1.yearsOfExperience); // Descending order
				}
				
				// 3. If both are equal, compare by name (ascending)
				return e1.name.compareTo(e2.name); // Ascending order
			}
		});
		
		return sorted;
	}
	
	public static void main(String[] args) {
		// Example from problem description
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Anna", 100000, 5));
		employees.add(new Employee("Bob", 90000, 7));
		employees.add(new Employee("Chris", 100000, 3));
		
		System.out.println("Input:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		System.out.println("\nOutput (sorted):");
		List<Employee> sorted = sortEmployees(employees);
		for (Employee emp : sorted) {
			System.out.println(emp);
		}
		
		// Expected output:
		// Anna(100K,5)
		// Chris(100K,3)
		// Bob(90K,7)
		
		System.out.println("\n--- Additional Test Cases ---\n");
		
		// Test case: All same salary, different experience
		List<Employee> test1 = new ArrayList<>();
		test1.add(new Employee("Alice", 50000, 2));
		test1.add(new Employee("Bob", 50000, 5));
		test1.add(new Employee("Charlie", 50000, 3));
		System.out.println("Test 1 - Same salary, different experience:");
		sortEmployees(test1).forEach(System.out::println);
		// Expected: Bob(50K,5), Charlie(50K,3), Alice(50K,2)
		
		// Test case: All same salary and experience, different names
		List<Employee> test2 = new ArrayList<>();
		test2.add(new Employee("Zoe", 60000, 4));
		test2.add(new Employee("Alice", 60000, 4));
		test2.add(new Employee("Bob", 60000, 4));
		System.out.println("\nTest 2 - Same salary and experience, different names:");
		sortEmployees(test2).forEach(System.out::println);
		// Expected: Alice(60K,4), Bob(60K,4), Zoe(60K,4)
		
		// Test case: All different
		List<Employee> test3 = new ArrayList<>();
		test3.add(new Employee("David", 80000, 6));
		test3.add(new Employee("Eve", 120000, 4));
		test3.add(new Employee("Frank", 80000, 8));
		System.out.println("\nTest 3 - Mixed values:");
		sortEmployees(test3).forEach(System.out::println);
		// Expected: Eve(120K,4), Frank(80K,8), David(80K,6)
	}
}
