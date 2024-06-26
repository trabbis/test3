package com.duksun.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public void duplicateElements() {
		String arg = "welcome hello welcome welcome hello hi ni welcome sayonara";
		assertEquals(2, Java8Questions.countDuplicates(arg).size());
	}
	
	@Test
	public void duplicateElements2() {
		String arg = "1 2 3 4 1 2 3";
		assertEquals(3, Java8Questions.countDuplicates(arg).size());
	}
	
	@Test
	public void uniqueElements() {
		String arg = "welcome hello welcome welcome hello hi ni welcome sayonara";
		assertEquals(3, Java8Questions.uniqueElements(arg).size());
		
	}
	
	@Test
	public void findFirstUniqueElement() {
		String arg = "welcome hello welcome welcome hello hi ni welcome sayonara";
		
		assertEquals(Optional.of("hi") , Java8Questions.findFirstUniqueElement(arg));
		
		
	}
	
	@Test
	public void stringConcatenateWithComa() {
		String arg = "welcome hello anyoung nihao bonjour";
		String concateNatedString = Java8Questions.stringConcatenatieWithComma(arg);
		
		assertEquals(true, concateNatedString.contains(","));
	}
	
	
	@Test
	public void longestString() {
		String[] arg = {"hi", "hello", "anyoung", "iamlongestnow"};
		
		assertEquals(Optional.of("iamlongestnow"), Java8Questions.longestString(arg));
	}
	
	
	@Test
	public void startWith2() {
		String[] arg = {"2hi", "hello", "2anyoung", "iamlongestnow"};
		Java8Questions.startWith2(arg);
		
	}
	
	@Test
	public void elementNotFouund() {
		String[] arg = new String[] {"2C", "4J", "4G"};
		assertEquals(null, Java8Questions.findElements(arg, "1A"));
	}
	
	@Test
	public void elementFound() {
		String[] arg = new String[] {"2C", "4J", "4G"};
		assertEquals("2C", Java8Questions.findElements(arg, "2C"));
	}
	
	@Test
	public void elementFoundTrueOrFalse() {
		String[] arg = new String[] {"2C", "4J", "4G"};
		assertEquals(true, Java8Questions.findElementTrueOrFalse(arg, "2c"));
		
	}
	
}


