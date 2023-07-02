package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution452Test {

    final Solution452 solution = new Solution452();

    @Test
    void findMinArrowShots() {
        final int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};

        final int result = solution.findMinArrowShots(points);

        assertEquals(2, result);
    }

    @Test
    void findMinArrowShots2() {
        final int[][] points = new int[][]{{1,2},{3,4},{5,6},{7,8}};

        final int result = solution.findMinArrowShots(points);

        assertEquals(4, result);
    }

    @Test
    void findMinArrowShots3() {
        final int[][] points = new int[][]{{1,2},{2,3},{3,4},{4,5}};

        final int result = solution.findMinArrowShots(points);

        assertEquals(2, result);
    }

    @Test
    void findMinArrowShots4() {
        final int[][] points = new int[][]{{1,8},{7,10},{8,11},{9,12}};

        final int result = solution.findMinArrowShots(points);

        assertEquals(2, result);
    }
}