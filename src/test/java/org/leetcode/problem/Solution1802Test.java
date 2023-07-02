package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1802Test {

    final Solution1802 solution = new Solution1802();

    @Test
    void maxValue1() {
        final int result = solution.maxValue(4, 2, 6);

        assertEquals(2, result);
    }

    @Test
    void maxValue2() {
        final int result = solution.maxValue(6, 1, 10);

        assertEquals(3, result);
    }

    @Test
    void maxValue3() {
        final int result = solution.maxValue(7, 0, 35);

        assertEquals(8, result);
    }

    @Test
    void maxValue4() {
        final int result = solution.maxValue(7, 5, 30);

        // 1 1 1 1 1 1 1
        // 1 1 1 1 1 2 1
        // 1 1 1 1 2 3 2
        // 1 1 1 2 3 4 3
        // 1 1 2 3 4 5 4
        // 1 2 3 4 5 6 5
        assertEquals(6, result);
    }
}