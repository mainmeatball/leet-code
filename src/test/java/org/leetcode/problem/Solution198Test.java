package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution198Test {

    final Solution198 solution = new Solution198();

    @Test
    void rob() {
        final int result = solution.rob(new int[]{1,2,3,1});

        assertEquals(4, result);
    }

    @Test
    void rob2() {
        final int result = solution.rob(new int[]{2,7,9,3,1});

        assertEquals(12, result);
    }
}