package com.travis;

public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] aa = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		
	
		sorting2(aa);

	}

	public static void sortingOriginal(int[] aa) {
		int[] arrayOfInts = aa;
		for (int i = arrayOfInts.length; --i >= 0;) {
			
			for (int j = 0; j < i; j++) {
				if (arrayOfInts[j] > arrayOfInts[j + 1]) {
					int temp = arrayOfInts[j];
					arrayOfInts[j] = arrayOfInts[j + 1];
					arrayOfInts[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arrayOfInts.length; i++) {
			System.out.print(arrayOfInts[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void sorting2(int[] aa) {
		
		int[] arrayOfInt = aa;
		
		for (int i = arrayOfInt.length; i>=0; i--) {
			
			for (int j=0; j<i-1; j++) {
				if (arrayOfInt[j] > arrayOfInt[j+1]) {
					int temp = arrayOfInt[j];
					arrayOfInt[j] = arrayOfInt[j+1];
					arrayOfInt[j+1] = temp;
				}
				
			}
		} //for (int i = arrayOfInt.length; i>=0; i--) {
		
		for (int i=0; i < arrayOfInt.length; i++) {
			System.out.print(arrayOfInt[i] + " ");
			
		}
		System.out.println();
		
	}
}



