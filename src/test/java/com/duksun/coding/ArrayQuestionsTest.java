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
	
}
