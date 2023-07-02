package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution746Test {

    final Solution746 solution = new Solution746();

    @Test
    void minCostClimbingStairs() {
        final int result = solution.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1});

        assertEquals(6, result);
    }
}