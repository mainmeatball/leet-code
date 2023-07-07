package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution724Test {

    final Solution724 solution = new Solution724();

    @Test
    void pivotIndex() {
        assertEquals(3, solution.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    @Test
    void pivotIndex2() {
        assertEquals(-1, solution.pivotIndex(new int[]{1,2,3}));
    }

    @Test
    void pivotIndex3() {
        assertEquals(0, solution.pivotIndex(new int[]{2,1,-1}));
    }
}