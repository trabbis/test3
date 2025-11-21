package com.travis;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {

	/**
	 * Finds the top 10 most frequent numbers from a stream of integers.
	 * 
	 * Time Complexity: O(N log 10) where N is the number of elements in the stream
	 * Space Complexity: O(N) for the frequency map
	 * 
	 * @param stream Stream of integers
	 * @return List of pairs (number, frequency) for the top 10 most frequent numbers
	 */
	public static List<int[]> findTop10MostFrequent(Stream<Integer> stream) {
		// Step 1: Count frequencies of all numbers - O(N) time, O(N) space
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		stream.forEach(num -> frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1));
		
		// Step 2: Use a min-heap of size 10 to find top 10 most frequent
		// Comparator: compare by frequency (ascending), so smallest frequency is at top
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
			(a, b) -> Integer.compare(a.getValue(), b.getValue())
		);
		
		// Iterate through all entries - O(N log 10) time
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (minHeap.size() < 10) {
				// If heap has less than 10 elements, just add
				minHeap.offer(entry);
			} else if (entry.getValue() > minHeap.peek().getValue()) {
				// If current frequency is greater than the minimum in heap, replace it
				minHeap.poll();
				minHeap.offer(entry);
			}
		}
		
		// Step 3: Convert heap to result list
		List<int[]> result = new ArrayList<>();
		while (!minHeap.isEmpty()) {
			Map.Entry<Integer, Integer> entry = minHeap.poll();
			result.add(new int[]{entry.getKey(), entry.getValue()});
		}
		
		// Reverse to get descending order (most frequent first)
		Collections.reverse(result);
		
		return result;
	}
	
	/**
	 * Alternative method that accepts an array of integers for easier testing
	 */
	public static List<int[]> findTop10MostFrequent(int[] numbers) {
		return findTop10MostFrequent(Arrays.stream(numbers).boxed());
	}

	public static void main(String[] args) {
		// Test with the provided example
		int[] input = {4, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
		
		System.out.println("Input stream: " + Arrays.toString(input));
		
		List<int[]> result = findTop10MostFrequent(input);
		
		System.out.println("Output (any order):");
		System.out.print("[");
		for (int i = 0; i < result.size(); i++) {
			int[] pair = result.get(i);
			System.out.print("(" + pair[0] + "," + pair[1] + ")");
			if (i < result.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		// Additional test with more than 10 distinct numbers
		System.out.println("\n--- Additional Test ---");
		int[] largeInput = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,  // 1 appears 10 times
		                     2, 2, 2, 2, 2, 2, 2, 2, 2,     // 2 appears 9 times
		                     3, 3, 3, 3, 3, 3, 3, 3,        // 3 appears 8 times
		                     4, 4, 4, 4, 4, 4, 4,            // 4 appears 7 times
		                     5, 5, 5, 5, 5, 5,              // 5 appears 6 times
		                     6, 6, 6, 6, 6,                 // 6 appears 5 times
		                     7, 7, 7, 7,                    // 7 appears 4 times
		                     8, 8, 8,                       // 8 appears 3 times
		                     9, 9,                          // 9 appears 2 times
		                     10,                            // 10 appears 1 time
		                     11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}; // 11 appears 11 times
		
		List<int[]> largeResult = findTop10MostFrequent(largeInput);
		System.out.println("Top 10 most frequent:");
		for (int[] pair : largeResult) {
			System.out.println("  Number " + pair[0] + " appears " + pair[1] + " times");
		}
	}

}
