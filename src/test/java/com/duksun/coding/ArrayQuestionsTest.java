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

}
