package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1779Test {

    final Solution1779 solution = new Solution1779();

    @Test
    void nearestValidPoint() {
        final int x = 3;
        final int y = 4;
        final int[][] coordinates = new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}};

        final int result = solution.nearestValidPoint(x, y, coordinates);

        assertEquals(2, result);
    }

    @Test
    void nearestValidPoint2() {
        final int x = 3;
        final int y = 4;
        final int[][] coordinates = new int[][]{{3,4}};

        final int result = solution.nearestValidPoint(x, y, coordinates);

        assertEquals(0, result);
    }

    @Test
    void nearestValidPoint3() {
        final int x = 3;
        final int y = 4;
        final int[][] coordinates = new int[][]{{2,3}};

        final int result = solution.nearestValidPoint(x, y, coordinates);

        assertEquals(-1, result);
    }
}