package com.duksun.coding.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
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
	
	public static List<Employee> salariesLessThan3rdSalary(List<Employee> arg) {

//		List<Employee> list = arg.stream().sorted((a,b) -> b.getSalary().intValue() - a.getSalary().intValue()).collect(Collectors.toList());
//		
//		List<Employee> top3 = new ArrayList<Employee>();
//		//Only return after third record;
//		for (int i=0;i<list.size();i++) {
//			if (i < 3) {
//				continue;
//			}
//			top3.add(list.get(i));
//		}
//		return top3;
		
		
		//Another option is to use skip()
		List<Employee> list = arg.stream().sorted((a,b) -> b.getSalary().intValue() - a.getSalary().intValue())
				.skip(3)
				.collect(Collectors.toList());

		return list;
	}

	public static Long higestSalary(List<Employee> arg) {
		List<Long> salaries = arg.stream().map(emp -> emp.getSalary()).collect(Collectors.toList());
		
		return salaries.stream().mapToLong(x -> x).summaryStatistics().getMax();
		
		
	}
	

	public static Set<Integer> duplicateElements(Integer[] args) {
		// {1,2,2,2,3,4,5,5};
		
		List<Integer> list = Arrays.asList(args);
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> set2 = list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()); //.forEach(System.out::println);
		return set2;
		
	}
	
	
	public static Integer functionalInterfaceTesting(Integer arg1, Integer arg2) {
		
		FunctionalInterface1 fc1 = (a, b) -> a * b;
		Integer multiply = fc1.multiply(arg1, arg2);
		
		return multiply;
	}


	//Too much
	public static void countDuplicates(String args) {
		
		Map<String, Long> count = Arrays.asList(args.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				
		System.out.println(count);
		
	}


	public static String stringConcatenatieWithComma(String args) {
		return Arrays.asList(args.split(" ")).stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
	}


	
	
}
