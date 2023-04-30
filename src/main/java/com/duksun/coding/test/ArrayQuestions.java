package com.duksun.coding.test;

public class ArrayQuestions {
	public static void main(String[] args) {
		
	}
	
	
	public static int findMax(int[] numbers) {
		//int[] numbers = new int[]{1,3,4,5,1, -1};

		int max = numbers[0];
//		int min = numbers[0];
		//for (int i =0; i <numbers.length; i++) {
		for(int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
//		System.out.println(max);
		return max;
		
		
	}

}
