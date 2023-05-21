package com.duksun.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


	public static List<Employee> sortBySalaryDescOrder(List<Employee> arg) {
		
		List<Employee> list = arg.stream().sorted((a,b) -> b.getSalary().intValue() - a.getSalary().intValue()).collect(Collectors.toList());
		
		return list;
		
	}

	public static List<Employee> sortByTop3Salaries(List<Employee> arg) {
//		List<Employee> list = arg.stream().sorted((a,b) -> b.getSalary().intValue() - a.getSalary().intValue()).collect(Collectors.toList());
		

//		List<Employee> top3 = new ArrayList<Employee>();
//		//Only return three records;
//		for (int i=0;i<list.size();i++) {
//			if (i >2) {
//				break;
//			}
//			top3.add(list.get(i));
//			
//		}
//		return top3;
		
		//Another option is to use limit()
		List<Employee> list = arg.stream().sorted((a,b) -> b.getSalary().intValue() - a.getSalary().intValue())
				.limit(3)
				.collect(Collectors.toList());
		
		return list;
		
	}

}
