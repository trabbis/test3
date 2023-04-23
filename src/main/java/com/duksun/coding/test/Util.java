package com.duksun.coding.test;

public class Util {

	public static Object compare(StringCompare compare) {
		
		if (compare.getFirst().length() + compare.getSecond().length() > 10) {
			return null;
		} else {
			return compare.getSecond();
		}
				
		
	}
}
