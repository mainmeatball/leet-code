package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution238Test {

    final Solution238 solution = new Solution238();

    @Test
    void productExceptSelf() {
        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    void productExceptSelf2() {
        assertArrayEquals(new int[]{0,0,9,0,0}, solution.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}