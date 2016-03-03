package com.travis;

public class BinarySearchMine {

	
	public static int[] sortedData = {1,4,9,11};
	/**
	 * @param args
	 * Binary search is based on sorted array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchMine binarySearchMine = new BinarySearchMine();
		int search = 5;
		
		System.out.print("Searching " + search + " in the { ");
		for (int i = 0; i < sortedData.length; i++) {
			System.out.print(sortedData[i] + " ");
		}
		System.out.print(" }");
		
		if ( binarySearchMine.find(search)) {
			System.out.println("We found..." + search);
		} else {
			System.out.println("We can not find..." + search);
		}
	}

	public boolean find(int search) {
		
		return binarySearch(search, 0, sortedData.length);
		
	}
	
	private boolean binarySearch(int search, int low,int high) {

		int middle;
		
		middle = (low + high) / 2;
		
		//1. check in the middle
		if ( sortedData[middle] == search ) {
			return true;
		//2.	
		} else if (low > high) {
			return false;
			
		//3. The search value is smaller than the data in the middle, then
		//   we look for the lowerBound narrowing down the upperBound
		} else if ( search < sortedData[middle] ) {
			 return binarySearch(search,low, middle-1);

		//4. The search value is bigger than the data in the middle, then
		//    we look for the upperBound narrowing down the lowerBound
		} else {
			 return binarySearch(search,middle+1, high);
		}
		
		
		
	}

	
	
	
}
