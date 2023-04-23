package com.duksun.coding;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.duksun.coding.test.Calculation;

public class CalculationTest {
	@Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
	
	
}
