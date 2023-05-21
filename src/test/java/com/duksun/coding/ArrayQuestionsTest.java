package com.duksun.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.duksun.coding.test.ArrayQuestions;

public class ArrayQuestionsTest {
	
	@Test
	public void findMax() {
		assertEquals(5, ArrayQuestions.findMax(new int[] {1,2,3,4,5,-1}));
		assertEquals(2147483647, ArrayQuestions.findMax(new int[] {1,2,3,4,Integer.MAX_VALUE,-1}));
	}

	@Test
	public void reverseArray() {
		String[] strings = new String[] {"one", "two", "three"};
		String[] newOnes = ArrayQuestions.reverseArray(strings);
		
		assertEquals("three", newOnes[0]);
		assertEquals("two", newOnes[1]);
		
	}
	
	@Test
	public void reverseNumber() {
		
		int a = 12345;
		assertEquals(54321, ArrayQuestions.reverseNumber(a));
		assertEquals(7654321, ArrayQuestions.reverseNumber(1234567));
	}
	
	@Test
	public void factorial() {
		assertEquals(2, ArrayQuestions.factorial(2));
		assertEquals(6, ArrayQuestions.factorial(3));
		assertEquals(6*4, ArrayQuestions.factorial(4));
		assertEquals(720, ArrayQuestions.factorial(6));
	}
	
	
	@Test
	public void arrayIntegerSortingReverse() {
		Integer[] sortedInteger = ArrayQuestions.arrayIntegerSortingReverse(new Integer[] {1,4,5,2});
		assertEquals(5, sortedInteger[0]);
	}
	
	@Test
	public void arrayPrimitiveSortReverse() {
		int[] orig = new int[] {1,4,5,2,7};
		int[] sorted = ArrayQuestions.arrayPrimitiveSortingReverse(orig);
		assertEquals(7, sorted[0]);
	}
	
	@Test
	public void rotationArrayTimes() {
		int[] orig = new int[] {1,2,3,4};
		int times = 1;
		int[] rotated = ArrayQuestions.rotationArraysTimes(orig, times);
		assertEquals(4, rotated[0]);
		
		orig = new int[] {1,2,3,4};
		times = 2;
		rotated = ArrayQuestions.rotationArraysTimes(orig, times);
		assertEquals(3, rotated[0]);
	}
	
	@Test
	public void smallestNotInArray() {
		int[] orig = new int[] {4,2,7,8};
		assertEquals(3, ArrayQuestions.smallestNotInArray(orig));

//		orig = new int[] {-1, -3};
//		assertEquals(1, ArrayQuestions.solution(orig));
//
//		orig = new int[] {1,2,3};
//		assertEquals(4, ArrayQuestions.solution(orig));
		
//		orig = new int[] {1,3, 6, 4, 1, 2};
//		assertEquals(5, ArrayQuestions.solution(orig));
		
		
	}
	
	@Test
	public void findLargest() {
//		int[] org = new int[] {1,1, 2, -1, 2, -1};
//		ArrayQuestions.findLargest(org);
		
//		int[] org = new int[] {3,2,-2,5,-3};
//		ArrayQuestions.findLargest(org);
		
//		int[] org = new int[] {1,2,3,-4};
//		ArrayQuestions.findLargest(org);
		
		int[] org = new int[] {};
		ArrayQuestions.findLargest(org);
	}
	
}
