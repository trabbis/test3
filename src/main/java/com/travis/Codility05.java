package com.travis;

import java.util.LinkedList;
import java.util.Queue;

public class Codility05 {

	/**
	 * Problem 4 — Shortest Path in Grid with Obstacles
	 * 
	 * Difficulty: ★★★★☆
	 * Concepts: BFS, queue, visited matrix, 2D traversal
	 * 
	 * Description:
	 * - Grid: 0 = walkable, 1 = blocked
	 * - Move in 4 directions (up, down, left, right)
	 * - Find shortest path from top-left (0,0) to bottom-right (N-1, M-1)
	 * 
	 * Edge cases:
	 * - No path available → return -1
	 * - Start or end is blocked
	 * - Single cell grid
	 */
	
	/**
	 * Class to represent a cell in the grid with its position and distance from start
	 */
	static class Cell {
		int row;
		int col;
		int distance;
		
		Cell(int row, int col, int distance) {
			this.row = row;
			this.col = col;
			this.distance = distance;
		}
	}
	
	/**
	 * Find the shortest path from (0,0) to (N-1, M-1) in a grid with obstacles
	 * 
	 * @param grid 2D array where 0 = walkable, 1 = blocked
	 * @return shortest path length, or -1 if no path exists
	 */
	public static int shortestPath(int[][] grid) {
		// Edge case: empty grid
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return -1;
		}
		
		int rows = grid.length;
		int cols = grid[0].length;
		
		// Edge case: single cell grid
		if (rows == 1 && cols == 1) {
			return grid[0][0] == 0 ? 0 : -1;
		}
		
		// Edge case: start or end is blocked
		if (grid[0][0] == 1 || grid[rows - 1][cols - 1] == 1) {
			return -1;
		}
		
		// Directions: up, down, left, right
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		// Visited matrix to track which cells have been explored
		boolean[][] visited = new boolean[rows][cols];
		
		// Queue for BFS
		Queue<Cell> queue = new LinkedList<>();
		
		// Start from (0, 0) with distance 0
		queue.offer(new Cell(0, 0, 0));
		visited[0][0] = true;
		
		// BFS traversal
		while (!queue.isEmpty()) {
			Cell current = queue.poll();
			
			// Check if we reached the destination
			if (current.row == rows - 1 && current.col == cols - 1) {
				return current.distance;
			}
			
			// Explore all 4 directions
			for (int i = 0; i < 4; i++) {
				int newRow = current.row + dx[i];
				int newCol = current.col + dy[i];
				
				// Check if the new position is valid
				if (isValid(newRow, newCol, rows, cols, grid, visited)) {
					// Mark as visited and add to queue
					visited[newRow][newCol] = true;
					queue.offer(new Cell(newRow, newCol, current.distance + 1));
				}
			}
		}
		
		// No path found
		return -1;
	}
	
	/**
	 * Check if a cell is valid for traversal
	 * 
	 * @param row row index
	 * @param col column index
	 * @param rows total number of rows
	 * @param cols total number of columns
	 * @param grid the grid
	 * @param visited visited matrix
	 * @return true if the cell is valid and can be visited
	 */
	private static boolean isValid(int row, int col, int rows, int cols, 
	                               int[][] grid, boolean[][] visited) {
		// Check bounds
		if (row < 0 || row >= rows || col < 0 || col >= cols) {
			return false;
		}
		
		// Check if cell is blocked
		if (grid[row][col] == 1) {
			return false;
		}
		
		// Check if already visited
		if (visited[row][col]) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// Example from problem description
		int[][] grid1 = {
			{0, 0, 1},
			{0, 0, 0},
			{1, 0, 0}
		};
		System.out.println("Example 1:");
		System.out.println("Grid:");
		printGrid(grid1);
		System.out.println("Shortest path: " + shortestPath(grid1)); // Expected: 4
		System.out.println();
		
		// Test case: No path available
		int[][] grid2 = {
			{0, 1, 0},
			{1, 1, 0},
			{0, 0, 0}
		};
		System.out.println("Example 2 (No path):");
		System.out.println("Grid:");
		printGrid(grid2);
		System.out.println("Shortest path: " + shortestPath(grid2)); // Expected: -1
		System.out.println();
		
		// Test case: Start blocked
		int[][] grid3 = {
			{1, 0, 0},
			{0, 0, 0},
			{0, 0, 0}
		};
		System.out.println("Example 3 (Start blocked):");
		System.out.println("Grid:");
		printGrid(grid3);
		System.out.println("Shortest path: " + shortestPath(grid3)); // Expected: -1
		System.out.println();
		
		// Test case: End blocked
		int[][] grid4 = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 1}
		};
		System.out.println("Example 4 (End blocked):");
		System.out.println("Grid:");
		printGrid(grid4);
		System.out.println("Shortest path: " + shortestPath(grid4)); // Expected: -1
		System.out.println();
		
		// Test case: Single cell (walkable)
		int[][] grid5 = {{0}};
		System.out.println("Example 5 (Single cell - walkable):");
		System.out.println("Grid:");
		printGrid(grid5);
		System.out.println("Shortest path: " + shortestPath(grid5)); // Expected: 0
		System.out.println();
		
		// Test case: Single cell (blocked)
		int[][] grid6 = {{1}};
		System.out.println("Example 6 (Single cell - blocked):");
		System.out.println("Grid:");
		printGrid(grid6);
		System.out.println("Shortest path: " + shortestPath(grid6)); // Expected: -1
		System.out.println();
		
		// Test case: Direct path
		int[][] grid7 = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0}
		};
		System.out.println("Example 7 (All walkable):");
		System.out.println("Grid:");
		printGrid(grid7);
		System.out.println("Shortest path: " + shortestPath(grid7)); // Expected: 4
	}
	
	/**
	 * Helper method to print the grid
	 */
	private static void printGrid(int[][] grid) {
		for (int[] row : grid) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}
