package com.travis;

import java.util.HashMap;
import java.util.Map;

public class Codility03 {

	
	/**
	 * Design a thread-safe LRU (Least Recently Used) cache
	 * 
	 * Requirements:
	 * - The cache must support two operations:
	 *   1. get(key) - retrieves the value associated with the key
	 *   2. put(key, value) - inserts or updates a key-value pair
	 * 
	 * - The cache has a fixed capacity. When the cache is full, the least recently 
	 *   used item must be removed.
	 * 
	 * Expected Behavior (Example):
	 *   LRUCache cache = new LRUCache(2); // Initialize cache with capacity 2
	 *   cache.put(1, "A");
	 *   cache.put(2, "B");
	 *   cache.get(1); // "A" becomes most recently used
	 *   cache.put(3, "C"); // removes key=2 (since it's the least recently used 
	 *                       // after get(1) made "A" most recent)
	 * 
	 * Edge cases to consider:
	 * - Re-inserting an existing key (should update value and make it most recent)
	 * - High concurrency (due to the "thread-safe" requirement)
	 * - Negative capacity, which should throw an IllegalArgumentException
	 */
	public static class LRUCache {
		private final int capacity;
		private final Map<Integer, Node> cache;
		private final Node head; // Dummy head node
		private final Node tail; // Dummy tail node

		// Inner class for doubly-linked list node
		private static class Node {
			int key;
			String value;
			Node prev;
			Node next;

			Node(int key, String value) {
				this.key = key;
				this.value = value;
			}
		}

		/**
		 * Initialize the LRU cache with the given capacity
		 * @param capacity the maximum number of items the cache can hold
		 * @throws IllegalArgumentException if capacity is negative
		 */
		public LRUCache(int capacity) {
			if (capacity < 0) {
				throw new IllegalArgumentException("Capacity cannot be negative");
			}
			this.capacity = capacity;
			this.cache = new HashMap<>();
			
			// Initialize dummy head and tail nodes
			this.head = new Node(0, null);
			this.tail = new Node(0, null);
			head.next = tail;
			tail.prev = head;
		}

		/**
		 * Get the value associated with the key
		 * @param key the key to look up
		 * @return the value associated with the key, or null if not found
		 */
		public synchronized String get(int key) {
			Node node = cache.get(key);
			if (node == null) {
				return null;
			}
			
			// Move the accessed node to the front (most recently used)
			moveToHead(node);
			return node.value;
		}

		/**
		 * Insert or update a key-value pair in the cache
		 * @param key the key
		 * @param value the value
		 */
		public synchronized void put(int key, String value) {
			Node node = cache.get(key);
			
			if (node != null) {
				// Key already exists - update value and move to head
				node.value = value;
				moveToHead(node);
			} else {
				// New key - need to add it
				if (cache.size() >= capacity) {
					// Cache is full - remove least recently used (tail)
					Node lru = tail.prev;
					removeNode(lru);
					cache.remove(lru.key);
				}
				
				// Create new node and add to head
				Node newNode = new Node(key, value);
				cache.put(key, newNode);
				addToHead(newNode);
			}
		}

		/**
		 * Move a node to the head of the list (most recently used)
		 */
		private void moveToHead(Node node) {
			removeNode(node);
			addToHead(node);
		}

		/**
		 * Add a node right after the head
		 */
		private void addToHead(Node node) {
			node.prev = head;
			node.next = head.next;
			head.next.prev = node;
			head.next = node;
		}

		/**
		 * Remove a node from the list
		 */
		private void removeNode(Node node) {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	}

	public static void main(String[] args) {
		// Example usage matching the problem description
		LRUCache cache = new LRUCache(2); // Initialize cache with capacity 2
		cache.put(1, "A");
		cache.put(2, "B");
		System.out.println(cache.get(1)); // "A" becomes most recently used
		cache.put(3, "C"); // removes key=2 (since it's the least recently used)
		System.out.println(cache.get(2)); // Should return null (was removed)
		System.out.println(cache.get(3)); // Should return "C"
		System.out.println(cache.get(1)); // Should return "A"
	}

}
