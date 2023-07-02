package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution149Test {

    final Solution149 solution = new Solution149();

    @Test
    void maxPoints() {
        final int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};

        final int result = solution.maxPoints(points);

        assertEquals(4, result);
    }

    @Test
    void maxPoints2() {
        final int[][] points = {{1,1},{2,2},{3,3}};

        final int result = solution.maxPoints(points);

        assertEquals(3, result);
    }
}