package org.leetcode.problem;


/**
 * Count Negative Numbers in a Sorted Matrix
 */
public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (final int[] ints : grid) {
            for (final int i : ints) {
                if (i < 0) count++;
            }
        }
        return count;
    }
}
