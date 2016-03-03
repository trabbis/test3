package com.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapCollections {
	
	public static void main(String[] args) {
		
		hashTableIsNotOrdered();
		
		hashMapIsNotOrderedLikeHashTable();
		
		treeMapOrdersByAscending();
		
		linkedHashMapReturnsAsTheyWereInserted();
	}
	

	private static void hashTableIsNotOrdered() {
		Hashtable<String, String> SR_PRIORITY = new Hashtable<String, String>();
		
		System.out.println("\nhashTable testing...");
		SR_PRIORITY.put("", "");
		SR_PRIORITY.put("A", "High");
		SR_PRIORITY.put("C", "Low");
		SR_PRIORITY.put("B", "Medium");
		
		Enumeration enumeration = SR_PRIORITY.keys();

		while (enumeration.hasMoreElements()) {
			String key = (String)enumeration.nextElement();
			
			System.out.println("keys..." + key);
		}
		
	}

	
	private static void hashMapIsNotOrderedLikeHashTable() {
		HashMap<String, String> SR_PRIORITY = new HashMap<String, String>();
		
		System.out.println("\nhashMap testing...");
		SR_PRIORITY.put("C", "Low");
		SR_PRIORITY.put("", "");
		SR_PRIORITY.put("A", "High");
		SR_PRIORITY.put("B", "Medium");
		
		Set<String> keys = SR_PRIORITY.keySet();

		Iterator<String> keyss =  keys.iterator();

		while (keyss.hasNext()) {
			System.out.println("keys..." + keyss.next());
		}
		
	}
	
	private static void treeMapOrdersByAscending() {
		TreeMap<String, String> SR_PRIORITY = new TreeMap<String, String>();
		
		System.out.println("\ntreeMap testing...");
		SR_PRIORITY.put("C", "Low");
		SR_PRIORITY.put("", "");
		SR_PRIORITY.put("A", "High");
		SR_PRIORITY.put("B", "Medium");
		
		Set<String> keys = SR_PRIORITY.keySet();

		Iterator<String> keyss =  keys.iterator();

		while (keyss.hasNext()) {
			System.out.println("keys..." + keyss.next());
			
		}
	}
	
	/*
	 * elements will be returned in the order in which they were inserted
	 */
	private static void linkedHashMapReturnsAsTheyWereInserted() {
		LinkedHashMap<String, String> SR_PRIORITY = new LinkedHashMap<String, String>();
		
		System.out.println("\nlinikedHashMap testing...");
		SR_PRIORITY.put("C", "Low");
		SR_PRIORITY.put("", "");
		SR_PRIORITY.put("A", "High");
		SR_PRIORITY.put("B", "Medium");
		
		Set<String> keys = SR_PRIORITY.keySet();

		Iterator<String> keyss =  keys.iterator();

		while (keyss.hasNext()) {
			System.out.println("keys..." + keyss.next());
			
		}
	}
	

}
