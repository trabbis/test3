package com.duksun.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.travis.TestUtilities3;

public class TestUtilities3Test {

	@Test
	public void capitalizeIfNttParam() {
		assertEquals("Abc", TestUtilities3.capitalizeIfNttParam("ntt", "abc"));
	}

	@Test
	public void capitalizeIfNttParamWithOneLetter() {
		assertEquals("A", TestUtilities3.capitalizeIfNttParam("ntt", "a"));
	}
	
	@Test
	public void capitalizeIfNttParamWithNumber() {
		assertEquals("123", TestUtilities3.capitalizeIfNttParam("ntt", "123"));
	}
	
	@Test
	public void capitalizeIfNttParamWithEmpty() {
		assertEquals(" ", TestUtilities3.capitalizeIfNttParam("ntt", " "));
	}
	
	@Test
	public void capitalizeIfNttParamWithNull() {
		assertEquals(null, TestUtilities3.capitalizeIfNttParam("ntt", null));
	}
	
	@Test
	public void capitalizeIfNttParamWithDifferentParam() {
		assertEquals("abc", TestUtilities3.capitalizeIfNttParam("nttttt", "abc"));
	}
	
	
}
