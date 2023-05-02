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
	
}
