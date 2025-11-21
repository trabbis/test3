package com.travis;

import java.util.HashSet;
import java.util.Set;

public class Codility02 {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
            // Create a set to store all positive integers from the array
            Set<Integer> positiveNumbers = new HashSet<>();
            
            // Add all positive integers to the set
            for (int num : A) {
                if (num > 0) {
                    positiveNumbers.add(num);
                }
            }
            
            // Find the smallest positive integer not in the set
            // Start from 1 and check each positive integer
            int candidate = 1;
            while (positiveNumbers.contains(candidate)) {
                candidate++;
            }
            
            return candidate;
        }
}
