package com.duksun.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.duksun.coding.test.Employee;
import com.duksun.coding.test.JavaCoreQuestions;

public class JavaCoreQuestionsTest {

	@Test
	public void sortByFirstName() {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "test5", 5L));
		list.add(new Employee(15, "test15", 15L));
		list.add(new Employee(8, "test8", 8L));
		list.add(new Employee(1, "test1", 1L));
		
		
		assertEquals("test1", JavaCoreQuestions.sortByFirstName(list).get(0).getFirstName());
		
		
		
	}
}
