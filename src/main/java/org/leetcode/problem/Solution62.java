package org.leetcode.problem;


/**
 * Unique Paths
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        final int[] row = new int[n];
        for (int i = 0; i < m; i++) {
            int prev = i == 0 ? 1 : 0;
            for (int j = 0; j < n; j++) {
                row[j] += prev;
                prev = row[j];
            }
        }
        return row[n-1];
    }
}
