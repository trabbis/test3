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
	public void capitalizeIfNttParamWithSingleQuote() {
		assertEquals("'123'", TestUtilities3.capitalizeIfNttParam("ntt", "'123'"));
	}
	
	@Test
	public void capitalizeIfNttParamWithSpace() {
		assertEquals(" ", TestUtilities3.capitalizeIfNttParam("ntt", " "));
	}
	
	@Test
	public void capitalizeIfNttParamWithBlank() {
		assertEquals("", TestUtilities3.capitalizeIfNttParam("ntt", ""));
	}
	
	@Test
	public void capitalizeIfNttParamWithNull() {
		assertEquals(null, TestUtilities3.capitalizeIfNttParam("ntt", null));
	}
	
	@Test
	public void capitalizeIfNttParamWithDifferentParam() {
		assertEquals("abc", TestUtilities3.capitalizeIfNttParam("nttttt", "abc"));
	}
	
	@Test
	public void capitalizeFirstAndLastWord() {
		assertEquals("Cat", TestUtilities3.capitalizeFirstAndLastWord("cat"));
	}

	@Test
	public void capitalizeFirstAndLastWordWithTwoWords() {
		assertEquals("Cat Echo", TestUtilities3.capitalizeFirstAndLastWord("cat echo"));
	}

	@Test
	public void capitalizeFirstAndLastWordWithSpacesFrontAndEnd() {
		assertEquals("Cat Echo", TestUtilities3.capitalizeFirstAndLastWord(" cat echo "));
	}

	@Test
	public void capitalizeFirstAndLastWordWithManyWords() {
		assertEquals("This is a test String", TestUtilities3.capitalizeFirstAndLastWord("this is a test string"));
	}
	

	@Test
	public void capitalizeAlwaysOnlyFirstLetter() {
		assertEquals("Cat", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("cat"));
	}
	
	@Test
	public void capitalizeOnlyFirstLetter2() {
		assertEquals("Hi dog", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("hi dog"));
	}
	
	@Test
	public void capitalizeOnlyFirstLetter3() {
		assertEquals("Echo something", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("echo something "));
	}
	
	@Test
	public void capitalizeOnlyFirstLetter4() {
		assertEquals("Echo something else", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("echo something else "));
	}
	

	@Test
	public void capitalizeEchoAsWell() {
		assertEquals("Cat Echo", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("cat echo"));
	}
	
	@Test
	public void capitalizeEchoAsWell2() {
		assertEquals("Cat Echo", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("cat   echo  "));
	}
	
	@Test
	public void capitalizeEchoAsWellButOthers() {
		assertEquals("Cat Echo korea", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("cat   echo        korea  "));
	}
	
	@Test
	public void capitalizeEchoAsWellButOthers2() {
		assertEquals("Hi korea food", TestUtilities3.capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters("hi korea food  "));
	}
	
}
