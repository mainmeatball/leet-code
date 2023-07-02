package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution547Test {

    final Solution547 solution = new Solution547();

    @Test
    void findCircleNum() {
        final int[][] isConnected = new int[][] {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        final int res = solution.findCircleNum(isConnected);

        assertEquals(2, res);
    }

    @Test
    void findCircleNum2() {
        final int[][] isConnected = new int[][] {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        final int res = solution.findCircleNum(isConnected);

        assertEquals(3, res);
    }
}