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

}
