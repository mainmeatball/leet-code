package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution2352Test {

    final Solution2352 solution = new Solution2352();

    @Test
    public void test1() {
        final int[][] grid = new int[][]{
                {3,2,1},
                {1,7,6},
                {2,7,7},
        };

        final int result = solution.equalPairs(grid);

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        final int[][] grid = new int[][]{
                {3,1,2,2},
                {1,4,4,5},
                {2,4,2,2},
                {2,4,2,2}
        };

        final int result = solution.equalPairs(grid);

        assertEquals(3, result);
    }

    @Test
    public void test3() {
        final int[][] grid = new int[][]{
                {11,1},
                {1,11},
        };

        final int result = solution.equalPairs(grid);

        assertEquals(2, result);
    }
}