package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution137Test {

    final Solution137 solution = new Solution137();

    @Test
    void singleNumber() {
        assertEquals(3, solution.singleNumber(new int[]{2,2,3,2}));
    }

    @Test
    void singleNumber2() {
        assertEquals(99, solution.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}