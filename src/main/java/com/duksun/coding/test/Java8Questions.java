package com.duksun.coding.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Questions {
	public static void main(String[] args) {
		
	}

	
	public static List<Integer> returnOnlyEven(Integer[] arg) {
		
		List<Integer> list = Arrays.asList(arg);
		list = list.stream().filter(p -> p % 2 == 0).toList();
		return list;
		
	}
	
	public static List<String> convertToUpperCase(String[] arg) {
		
		List<String> list = Arrays.asList(arg);
		list = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		return list;
		
	}
	
	public static List<Employee> sortedByEmployeeId(List<Employee> arg) {
		
		List<Employee> list = arg.stream().sorted((a,b) -> a.getEmpId() - b.getEmpId()).collect(Collectors.toList());
		
		return list;
	}
	
}
