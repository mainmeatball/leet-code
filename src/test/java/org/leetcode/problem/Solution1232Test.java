package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1232Test {

    final Solution1232 solution = new Solution1232();

    @Test
    void checkStraightLine() {
        final int[][] array = new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

        final boolean result = solution.checkStraightLine(array);

        assertTrue(result);
    }

    @Test
    void checkStraightLine2() {
        final int[][] array = new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};

        final boolean result = solution.checkStraightLine(array);

        assertFalse(result);
    }

    @Test
    void checkStraightLine3() {
        final int[][] array = new int[][]{{4,8},{-2,8},{1,8},{8,8},{-5,8},{0,8},{7,8},{5,8}};

        final boolean result = solution.checkStraightLine(array);

        assertTrue(result);
    }
}