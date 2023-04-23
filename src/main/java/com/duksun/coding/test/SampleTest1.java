package com.duksun.coding.test;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> first = new LinkedList<Integer>();
//		first.add(2);
//		first.add(4);
//		first.add(3);
		//243 ==> 2*1 + 4*10 + 3*100  ==> 342
		//342
		first.add(9);
		first.add(9);
		first.add(9);
		first.add(9);
		first.add(9);
		first.add(9);
		first.add(9);
		
		
		
		LinkedList<Integer> second = new LinkedList<Integer>();
//		second.add(5);
//		second.add(6);
//		second.add(4);
		second.add(9);
		second.add(9);
		second.add(9);
		second.add(9);
		//564 == > 465
		
		//807 ==> 708

		sumOfLinkedLinkedList(first, second);
		
	}
	
	public static LinkedList<String> sumOfLinkedLinkedList(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		
		Iterator<Integer> aIter = a.iterator();
		Integer time = 1; //1, 10, 100, 1000
		Integer asum = 0;
		while (aIter.hasNext()) {
			asum = asum + aIter.next() * time;
			time = time * 10;
		}
		System.out.println(asum);
		
		Iterator<Integer> bIter = b.iterator();
		time = 1; //1, 10, 100, 1000
		Integer bsum = 0;
		while (bIter.hasNext()) {
			bsum = bsum + bIter.next() * time;
			time = time * 10;
		}
		System.out.println(bsum);
		
		Integer total = asum + bsum;
		String sTotal = String.valueOf(total);
		
		LinkedList<String> newTotal = new LinkedList<String>();
		for (int i=sTotal.length() - 1; i>=0; i--) {
			newTotal.add(sTotal.substring(i,i+1));
		}
		
		
		return null;

	}

}
