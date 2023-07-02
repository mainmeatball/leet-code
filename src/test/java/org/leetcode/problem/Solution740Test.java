package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution740Test {

    final Solution740 solution = new Solution740();

    @Test
    void deleteAndEarn() {
        final int result = solution.deleteAndEarn(new int[]{3,4,2});

        assertEquals(6, result);
    }

    @Test
    void deleteAndEarn2() {
        final int result = solution.deleteAndEarn(new int[]{2,2,3,3,3,4});

        assertEquals(9, result);
    }

    @Test
    void deleteAndEarn3() {
        final int result = solution.deleteAndEarn(new int[]{1,1,2,2,3,3,3,4,5,5,6,6,6,6,6,6,7,8,8,9});

        assertEquals(63, result);
    }
}