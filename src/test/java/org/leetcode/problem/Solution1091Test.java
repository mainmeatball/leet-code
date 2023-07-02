package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1091Test {

    final Solution1091 solution = new Solution1091();

    @Test
    void minClearPath() {
        final int[][] grid = new int[][] {
                { 0, 0, 0 },
                { 1, 1, 0 },
                { 1, 1, 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(4, res);
    }

    @Test
    void minClearPathNoPath() {
        final int[][] grid = new int[][] {
                { 1, 0, 0 },
                { 1, 1, 0 },
                { 1, 1, 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(-1, res);
    }

    @Test
    void minClearPathNoPath2() {
        final int[][] grid = new int[][] {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 0, 0, 1, 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(-1, res);
    }

    @Test
    void minClearPathNoPath3() {
        final int[][] grid = new int[][] {
                { 0, 0, 0 },
                { 1, 1, 0 },
                { 1, 1, 1 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(-1, res);
    }

    @Test
    void minClearPathEverythingIsClear() {
        final int[][] grid = new int[][] {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(5, res);
    }

    @Test
    void minClearPath1Square() {
        final int[][] grid = new int[][] {
                { 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(1, res);
    }

    @Test
    void minClearPathZigZag() {
        final int[][] grid = new int[][] {
                { 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0 }
        };

        final int res = solution.shortestPathBinaryMatrix(grid);

        assertEquals(13, res);
    }

}