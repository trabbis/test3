package com.travis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestUtilities4 {

	/**
	 * Merges overlapping time windows and returns the consolidated list.
	 * 
	 * @param intervals Array of intervals where each interval is [start, end]
	 * @return List of merged intervals
	 */
	public static int[][] mergeIntervals(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return new int[0][];
		}
		
		// Sort intervals by start time
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		
		List<int[]> merged = new ArrayList<>();
		merged.add(intervals[0]);
		
		for (int i = 1; i < intervals.length; i++) {
			int[] current = intervals[i];
			int[] last = merged.get(merged.size() - 1);
			
			// If current interval overlaps with the last merged interval
			if (current[0] <= last[1]) {
				// Merge: update the end time to the maximum of both
				last[1] = Math.max(last[1], current[1]);
			} else {
				// No overlap, add as new interval
				merged.add(current);
			}
		}
		
		return merged.toArray(new int[merged.size()][]);
	}
	
	public static void main(String[] args) {
		// Test with the provided example
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {9, 12}, {15, 18}};
		
		System.out.println("Input:");
		printIntervals(intervals);
		
		int[][] merged = mergeIntervals(intervals);
		
		System.out.println("\nOutput:");
		printIntervals(merged);
	}
	
	// Helper method to print intervals
	private static void printIntervals(int[][] intervals) {
		System.out.print("[");
		for (int i = 0; i < intervals.length; i++) {
			System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
			if (i < intervals.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
