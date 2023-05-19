package com.duksun.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayQuestions {
	public static void main(String[] args) {
		
	}
	
	
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		//for (int i =0; i <numbers.length; i++) {
		for(int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public static String[] reverseArray(String[] strings) {
		
//		int size = strings.length;
//		String[] newStrings = new String[size];
//		
//		for(int i=0;i<size;i++) {
//			newStrings[size-i-1] = strings[i];
//		}
//		return newStrings;
		
		//You can think of Stream API, but for String sorting, they are sorted by alphabetical order
		//So, it won't meet requirement
//		List<String> reversed = Arrays.asList(strings).stream().sorted(Collections.reverseOrder()).
//					collect(Collectors.toList());
		
		//Another way is using LinkedList and read it back
		LinkedList<String> list = new LinkedList<String>();
		for(int i=0;i<strings.length;i++) {
			list.add(strings[i]);
		}
		
		LinkedList<String> reversed = new LinkedList<String>();
		for(int i=list.size()-1; i >= 0 ;i--) {
			reversed.add(list.get(i));
		}
		String[] reversedArray = reversed.stream().toArray(String[]::new);
		return reversedArray;
		
		
	}
	

	public static int reverseNumber(int input) {
		
		//1. Take out last digit and multiply by 10
		//2. take out again last digit and add up with first setup output
		
//		int reverse = 0;
//		while (input > 0) {
//			int remainder = input % 10;
//			input = input / 10;
//			reverse = reverse * 10 + remainder;
//		}
//		
//		//12345%10 = 5
//		//12345/10 = 1234
//		//5
//		
//		//1234%10 = 4
//		//1234/10 = 123 (mok)
//		//5*10 + 4 = 54
//		
//		//123%10 = 3
//		//123/10 = 12
//		//54* 10 + 3 543
//		
//		//12%10 = 2
//		//12/10 = 1
//		//543*10 + 2 = 5432
//		
//		//1%10 = 1
//		//1/10 = 0
//		//5432*10 + 1
//		
//		return reverse;
		
		//Another way is using String
		//Now input becomes String 12345
		//Read from back and append it using StringBuilder
		// or using reverse() method of StringBuilder
		String text = String.valueOf(input);
		
		StringBuilder sb = new StringBuilder();
		sb.append(text).reverse();
		
		return Integer.parseInt(sb.toString());
		
		
		
		
	}
	
	public static int factorial(int number) {
		
		int factorial = 1;
		
		while (number > 0) {
			factorial = factorial * number;
			number = number -1;
		}
		
		return factorial;
	}
	
	
	public static Integer[] arrayIntegerSortingReverse(Integer[] numbers) {
		Arrays.sort(numbers, Collections.reverseOrder());
		return numbers;
	}
	
	public static int[] arrayPrimitiveSortingReverse(int[] numbers) {
		//There is no Arrays.sort for primitive data type for descending 
		//So we will do ascending first and flip over
		//1. sorting in ascending order first
		//2. reverse manually
//		Arrays.sort(numbers);
//
//		int last = numbers.length -1;
//		int middle = numbers.length/2;
//		for(int i=0;i < middle;i++) {
//			int temp = numbers[i];
//			numbers[i] = numbers[numbers.length - i -1];
//			numbers[last-i] = temp;
//		}
//		return numbers;
		
		//Another option is using Stream API
		List<Integer> reversedList = Arrays.stream(numbers).
									boxed().
									sorted(Collections.reverseOrder()).
									collect(Collectors.toList());
		
		int[] reversedArrays = reversedList.stream().mapToInt(Integer::intValue).toArray();
		
		return reversedArrays;
		
	}

	
	public static int[] rotationArraysTimes(int[] data, int k) {
		//       1,2,3,4
		//==>  4,1,2,3 (1st time)
		//==>3,4,1,2   (2nd time)
		
		//think about recursive
		for(int i=1; i<=k; i++) {
			data = basicRotationArray(data);
			System.out.println(data.toString());
		}
		
		return data;
	}

	private static int[] basicRotationArray(int[] data) {
		int tempLast = data[data.length - 1];
		
		for(int last = data.length - 1; 0 <last;last--) {
			int temp = data[last-1];
			data[last] = temp;
		}
		data[0] = tempLast;
		
		return data;
	}
	
	
	/*
	 * that, given an array A of N integers, returns the smallest positive integer
	 *  (greater than 0) that does not occur in A.
	 * 
	 */
	public static int smallestNotInArray(int[] numbers) {
		//1. sort integers 
		//2. put inside set
		
		//Dealing with arrays directly.
		//It works, but try to use Stream API for concise code
//		Arrays.sort(numbers);
//		
//		int smallest = numbers[0];
//		int largest = numbers[numbers.length-1];
//		Boolean notInArray = false;
//	
//		List list = new ArrayList<>();
//		for(int i=0; i<numbers.length; i++) {
//			list.add(numbers[i]);
//		}
		
		//Using Stream API
		//I tried to using Stream, but that great so far
		//Below one does not work. In order to make it work, should be list.get(0) first
//		List<int[]> list = Arrays.asList(numbers);
//		list = list.stream().sorted().collect(Collectors.toList());
		
		//This one works by the way
		List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
		
		int smallest = list.get(0);
		int largest = list.get(list.size()-1);
		Boolean notInArray = false;
		
		for(int i=0; i<numbers.length; i++) {
			if (list.contains(smallest)) {
				smallest++;
			} else {
				notInArray = true;
				break;
			}
		}
		
		if (!notInArray) {
			smallest = largest + 1;
		}
		
		return (smallest <=0) ? 1: smallest;
	}
	
	
	public static int findLargest(int[] numbers) {
		
		//{1,2,-1, -2};
		//sort first -2,-1,1,2
		//adding should be zero (until less than zero)
		
		if (numbers == null) {
			return 0;
		}
		
		
		List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

		java.util.Set<Integer> found = new java.util.HashSet<Integer>();
		
		for(int i=0;i<list.size();i++) {
			if (list.get(i) < 0) {
				for(int j=i+1;j<list.size();j++) {
					if (list.get(i) + list.get(j) == 0) {
						found.add(list.get(j));
						break;
					}
				}
			} else {
				break;
			}
		}
		
		if (found.isEmpty()) {
			return 0;
		} else {
			long count = found.stream().count();
			Stream<Integer> stream = found.stream();
			Integer last = stream.skip(count - 1).findFirst().get();
			return last;
		}
		
	}
	

	
	
	
}
