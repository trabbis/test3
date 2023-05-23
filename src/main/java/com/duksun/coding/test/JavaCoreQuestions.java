package com.duksun.coding.test;

import java.util.Collections;
import java.util.List;

public class JavaCoreQuestions {

	public static void main(String[] args) {

	}

	public static List<Employee> sortByFirstName(List<Employee> list) {
		
		Collections.sort(list, new SortByNameComparator());
		
		return list;
		
		
		
	}
	
	

}
