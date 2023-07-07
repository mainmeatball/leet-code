package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1004Test {

    final Solution1004 solution = new Solution1004();

    @Test
    void longestOnes() {
        assertEquals(6, solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    @Test
    void longestOnes2() {
        assertEquals(10, solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}