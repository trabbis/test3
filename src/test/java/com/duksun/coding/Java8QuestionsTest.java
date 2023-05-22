package com.duksun.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.duksun.coding.test.Employee;
import com.duksun.coding.test.Java8Questions;

public class Java8QuestionsTest {

	@Test
	public void returnOnlyEvenNumbers() {
		Integer[] arg = new Integer[] {1,3,4,6};
		
		assertEquals(2, Java8Questions.returnOnlyEven(arg).size());
		assertEquals(true, Java8Questions.returnOnlyEven(arg).contains(4));
	}
	
	@Test
	public void convertToUpperCase() {
		
		String[] arg = new String[] {"aa", "bb"};
		
		assertEquals("AA", Java8Questions.convertToUpperCase(arg).get(0));
		assertEquals("BB", Java8Questions.convertToUpperCase(arg).get(1));
	}

	@Test
	public void sortByEmpId() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5"));
		list.add(new Employee(4, "test4"));
		list.add(new Employee(1, "test1"));
		list.add(new Employee(21, "test21"));
		
		assertEquals(1, Java8Questions.sortedByEmployeeId(list).get(0).getEmpId());
	}
	
	@Test
	public void sortBySalaryDescOrder() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5", 5L));
		list.add(new Employee(1, "test1", 1L));
		list.add(new Employee(15, "test15", 15L));
		list.add(new Employee(8, "test8", 8L));
		
		assertEquals(15L, Java8Questions.sortBySalaryDescOrder(list).get(0).getSalary());
	}
	
	@Test
	public void sortByTop3Salaries() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5", 5L));
		list.add(new Employee(1, "test1", 1L));
		list.add(new Employee(15, "test15", 15L));
		list.add(new Employee(8, "test8", 8L));
		
		assertEquals(5L, Java8Questions.sortByTop3Salaries(list).get(2).getSalary());
		
	}
	
	@Test
	public void fetchAllEmployeeSalariesLessThan3rdHigestSalary() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5", 5L));
		list.add(new Employee(1, "test1", 1L));
		list.add(new Employee(15, "test15", 15L));
		list.add(new Employee(8, "test8", 8L));
		
		assertEquals(1L, Java8Questions.salariesLessThan3rdSalary(list).get(0).getSalary());
	}
	
	@Test
	public void highestSalary () {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5", 5L));
		list.add(new Employee(1, "test1", 1L));
		list.add(new Employee(15, "test15", 15L));
		list.add(new Employee(8, "test8", 8L));
		
		assertEquals(15L, Java8Questions.higestSalary(list));
		
	}
	
	
	
	@Test
	public void findOutDuplicateElements() {
		Integer[] arr = new Integer[] {1,2,2,2,3,4,5,5};
		
		assertEquals(2, Java8Questions.duplicateElements(arr).size()); //should return 2,5
	}
	
	@Test
	public void functionalInterfaceTesting() {
		assertEquals(42, Java8Questions.functionalInterfaceTesting(6,7).intValue());
		
	}
	
	@Test
	public void countingDuplicates() {
		String arg = "welcome hello welcome hello hi ni welcome";
		Java8Questions.countDuplicates(arg);
		
	}
	
	@Test
	public void stringConcatenateWithComa() {
		String arg = "welcome hello anyoung nihao bonjour";
		String concateNatedString = Java8Questions.stringConcatenatieWithComma(arg);
		
		assertEquals(true, concateNatedString.contains(","));
		
		
	}
}


