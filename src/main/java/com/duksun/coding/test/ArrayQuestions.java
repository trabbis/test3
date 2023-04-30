package com.duksun.coding.test;

public class ArrayQuestions {
	public static void main(String[] args) {
		
	}
	
	
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		//for (int i =0; i <numbers.length; i++) {
		for(int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public static String[] reverseArray(String[] strings) {
		
		int size = strings.length;
		String[] newStrings = new String[size];
		
		for(int i=0;i<size;i++) {
			newStrings[size-i-1] = strings[i];
		}
		
		return newStrings;
	}
	

	public static int reverseNumber(int input) {
		
		//1. Take out last digit and multiply by 10
		//2. take out again last digit and add up with first setup output
		
		
		int reverse = 0;
		while (input > 0) {
			int remainder = input % 10;
			input = input / 10;
			reverse = reverse * 10 + remainder;
		}
		
		//12345%10 = 5
		//12345/10 = 1234
		//5
		
		//1234%10 = 4
		//1234/10 = 123 (mok)
		//5*10 + 4 = 54
		
		//123%10 = 3
		//123/10 = 12
		//54* 10 + 3 543
		
		//12%10 = 2
		//12/10 = 1
		//543*10 + 2 = 5432
		
		//1%10 = 1
		//1/10 = 0
		//5432*10 + 1
		
		
		
		return reverse;
		
	}
}
