package org.leetcode.problem;


/**
 * Unique Paths II
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int m = obstacleGrid.length, n = obstacleGrid[0].length;
        for (int i = 0; i < n; i++) {
            obstacleGrid[m - 1][i] = 1 - obstacleGrid[m - 1][i];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (i == m - 1) {
                    if (obstacleGrid[i][j] == 0) {
                        continue;
                    }
                    obstacleGrid[i][j] = obstacleGrid[i][j+1];
                    continue;
                }
                if (j == n - 1) {
                    if (obstacleGrid[i][j] == 1) {
                        obstacleGrid[i][j] = 0;
                        continue;
                    }
                    obstacleGrid[i][j] = obstacleGrid[i+1][j];
                    continue;
                }
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i][j+1] + obstacleGrid[i+1][j];
            }
        }
        return obstacleGrid[0][0];
    }
}
