package com.travis;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(replace("lazy", "supine", "A quick bronze fox lept a lazy bovine"));
		System.out.println(replace("$DIR", "/home/ian", "$DIR/xxx"));
		
		System.out.println("switching pairs of abcde..." + switchChars("abcde") );
		System.out.println("switching pairs of 1234567890..." + switchChars("1234567890") );
//		System.out.println( switchChars("A quick bronze fox lept a lazy bovine") );
		

	}

	
	/*
	 * Switch pairs characters
	 */
	public static String switchChars(String inString) {
		//1. basic input validation
		if (inString == null) return inString;
		int len = inString.length();
		if (len <=0) {
			return inString;
		}
		
		//2. calculate how many pairs are
		int howManyPairs = len / 2;
		
		StringBuffer newString = new StringBuffer();
		
		//3. loop through each pairs and switch each other
		for (int i=0; i<howManyPairs; i++) {
			char a = inString.charAt(i*2);
			char b = inString.charAt(i*2+ 1);
			
			newString.append(b);
			newString.append(a);
//			System.out.println("===>" + a + "," + b);
//			System.out.println("===>" + newString.toString() );
		}

		//4. append any remaining chars
		if (len > howManyPairs * 2) {
//			System.out.println("===>" + inString.substring(howManyPairs * 2));
			newString.append( inString.substring(howManyPairs * 2) );
		}
		
		return newString.toString();
		
		
	}
	
	public static String replace(String oldStr, String newStr, String inString) {
	    int start = inString.indexOf(oldStr);
	    if (start == -1) {
	      return inString;
	    }
	    StringBuffer sb = new StringBuffer();
	    sb.append(inString.substring(0, start));
	    sb.append(newStr);
	    sb.append(inString.substring(start+oldStr.length()));
	    return sb.toString();
	  }



	
	
}




