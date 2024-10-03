package com.travis;

public class TestUtilities3 {
	
	public static String capitalizeIfNttParam(String paramName, String paramValue) {
		if (paramName != null && paramName.equalsIgnoreCase("ntt") && paramValue != null && paramValue.length() >= 1) {
			StringBuilder sb = new StringBuilder();
			sb.append(paramValue.substring(0, 1).toUpperCase());
			sb.append(paramValue.substring(1));
			return sb.toString();
		}
		return paramValue;
	}

	
}
