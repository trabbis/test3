package com.duksun.coding.test;

public class SampleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringCompare s = new StringCompare("first", "second");
		StringCompare s = new StringCompare("first", "seco");
		
		
		Object o = Util.compare(s);
		System.out.println(o);
		
		

	}

}

/*
The question was :

Write a class called StringCompare that contains two String fields: 'first' and 'second'.

Next, create another class called Util that contains a method called 'compare'.
The 'compare' method takes in a 'StringCompare' object.
It returns null if the length of the 'first' string plus the length of the 'second' string in the StringCompare object is greater than 10.
Otherwise, it returns the 'second' string from StringCompare.


StringCompare (first, second)
Util.compare(StringCompare)
return null (if sum of length > 10)
otherwise return just second string




*/
