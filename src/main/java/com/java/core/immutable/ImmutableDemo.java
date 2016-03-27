package com.java.core.immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		String test1 = new String("abc");
//		String test1 = "abc";
		System.out.println(test1);
		String temp1 = test1;
		
		//test1 is changed. How can you call String object is immutable?
		//Here is my understanding
		//String class itself is immutable class, so when test1 is changed,
		//new test1 object is created, not the same when test1 is created.
		//So try to inspect test1 when it was created
		//and when it was modifed.
		//It is hard, but internally test1 is created again. Not the same instance one.
		
		test1 = test1 + " added more";		test1 = test1 + " added more";
		System.out.println(test1);
		
		

	}

}
