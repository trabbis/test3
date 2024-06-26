package com.duksun.coding.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Questions {
	public static void main(String[] args) {
		
	}

	
	public static List<Integer> returnOnlyEven(Integer[] arg) {
		
		List<Integer> list = Arrays.asList(arg);
		list = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
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

		//It works, but check another solution
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

		//It works, but check another solution
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


	//Bit tricky, but take it one at a time
	public static List<String> countDuplicates(String args) {
		
		List<String> collect = Arrays.asList(args.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) //Group by key returning Map
				.entrySet().stream() //Getting entrySet of Map
				.filter(x -> x.getValue() > 1) //filtering only more than one occurrences
//				.map(Map.Entry::getKey) //Now only getting keys from Map. Same as below syntax
				.map(x -> x.getKey())
				.collect(Collectors.toList());
				
		//System.out.println(collect); //type in sysout
		
		return collect;
		
	}

	
	public static List<String> uniqueElements(String args) {
		
		List<String> collect = Arrays.asList(args.split(" ")).stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue() <=1)
			.map(x->x.getKey())
			.collect(Collectors.toList());
		
		//System.out.println(collect);
		
		return collect;
	}
	
	public static Optional<String> findFirstUniqueElement(String args) {
		
		Optional<String> findFirst = Arrays.asList(args.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Group by key returning Map
				.entrySet().stream() //Getting entrySet of Map
				.filter(x -> x.getValue() <= 1) //filtering only more than one occurrences
				.map(x -> x.getKey())
				.findFirst();
				
		//System.out.println(collect); //type in sysout
		
		return findFirst;
		
	}

	

	public static String stringConcatenatieWithComma(String args) {
		return Arrays.asList(args.split(" ")).stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
	}


	public static Optional<String> longestString(String[] arg) {

		Optional<String> reduce = Arrays.asList(arg).stream()
			.reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2);
		
			
		return reduce;
		
	
		
		
	}


	public static List<String> startWith2(String[] arg) {
		List<String> collect = Arrays.asList(arg).stream()
			.filter(x -> x.startsWith("2"))
			.collect(Collectors.toList());
		
		
		return collect;
		
	}


	public static String findElements(String[] arg, String key) {
		return Arrays.asList(arg).stream()
			.filter(list -> list.equalsIgnoreCase(key))
			.findFirst()
			.orElse(null);
	}
	
	public static Boolean findElementTrueOrFalse(String[] arg, String key) {
		
		return Arrays.asList(arg).stream().anyMatch(key::equalsIgnoreCase);
	}
	
	
}
