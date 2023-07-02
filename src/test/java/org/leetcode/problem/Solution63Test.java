package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution63Test {

    final Solution63 solution = new Solution63();

    @Test
    void uniquePathsWithObstacles() {
        final int[][] obstacleGrid = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void uniquePathsWithObstacles2() {
        final int[][] obstacleGrid = new int[][]{
                {0,1},
                {0,0}
        };

        assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void uniquePathsWithObstacles3() {
        final int[][] obstacleGrid = new int[][]{
                {0,0},
                {0,1}
        };

        assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void uniquePathsWithObstacles4() {
        final int[][] obstacleGrid = new int[][]{
                {0,0}
        };

        assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void uniquePathsWithObstacles5() {
        final int[][] obstacleGrid = new int[][]{
                {1,0}
        };

        assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
    }
}