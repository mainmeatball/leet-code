package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1991Test {

    final Solution1991 solution = new Solution1991();

    @Test
    void findMiddleIndex() {
        assertEquals(3, solution.findMiddleIndex(new int[]{2,3,-1,8,4}));
    }

    @Test
    void findMiddleIndex2() {
        assertEquals(2, solution.findMiddleIndex(new int[]{1,-1,4}));
    }

    @Test
    void findMiddleIndex3() {
        assertEquals(-1, solution.findMiddleIndex(new int[]{2,5}));
    }
}