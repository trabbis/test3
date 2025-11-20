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

	
	public static String capitalizeFirstAndLastWord(String input) {
		// Trim the input to remove extra spaces
        input = input.trim();

        // Find the index of the first space and last space
        int firstSpaceIndex = input.indexOf(' ');
        int lastSpaceIndex = input.lastIndexOf(' ');

        // If there is no space, capitalize the single word
        if (firstSpaceIndex == -1) {
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        }

        // Separate into parts: first word, middle, and last word
        String firstWord = input.substring(0, firstSpaceIndex);
        String lastWord = input.substring(lastSpaceIndex + 1);
        String middlePart = firstSpaceIndex == lastSpaceIndex ? "" : input.substring(firstSpaceIndex + 1, lastSpaceIndex);

        // Capitalize the first and last words
        firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);
        lastWord = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);

        // Combine the result with proper spacing
        if (middlePart.isEmpty()) {
            return firstWord + " " + lastWord;
        }
        return firstWord + " " + middlePart + " " + lastWord;
	}
	

	 public static String capitalizeFirstLetterAlwaysAndOnlyEchoOrCurlOtherLetters(String input) {
	        input = input.trim();

	        // Split the input string into words using space as the delimiter
	        String[] words = input.split("\\s+");

	        // Always capitalize the first letter
	        // For other letters, capitalize only echo or curl 
	        for (int i = 0; i < words.length; i++) {
	        	if (i == 0 && !words[i].isEmpty()) {
	                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
	        	} else if (!words[i].isEmpty() &&
	            	(words[i].equalsIgnoreCase("echo") || 
	            			words[i].equalsIgnoreCase("curl"))) {
	                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
	            }
	        }

	        return String.join(" ", words);
	    }
	 
	
}
