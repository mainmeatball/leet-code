package org.leetcode.problem;


/**
 * Minimum Path Sum
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j == grid[0].length - 1) {
                    continue;
                }
                if (i == grid.length - 1) {
                    grid[i][j] += grid[i][j + 1];
                    continue;
                }
                if (j == grid[0].length - 1) {
                    grid[i][j] += grid[i + 1][j];
                    continue;
                }
                grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
            }
        }
        return grid[0][0];
    }
}
