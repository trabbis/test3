package com.travis;

public class TestUtilities3 {
	
	public static String capitalizeIfNttParam(String paramName, String paramValue) {
		if (paramName != null && paramName.equalsIgnoreCase("ntt") && paramValue != null && paramValue.length() >= 1) {
			return paramValue.substring(0, 1).toUpperCase() + paramValue.substring(1);
		}
		return paramValue;
	}

	
}
