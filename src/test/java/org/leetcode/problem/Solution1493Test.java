package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1493Test {

    final Solution1493 solution = new Solution1493();

    @Test
    void longestSubarray() {
        assertEquals(3, solution.longestSubarray(new int[]{1,1,0,1}));
    }

    @Test
    void longestSubarray2() {
        assertEquals(5, solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }

    @Test
    void longestSubarray3() {
        assertEquals(2, solution.longestSubarray(new int[]{1,1,1}));
    }

    @Test
    void longestSubarray4() {
        assertEquals(8, solution.longestSubarray(new int[]{1,0,0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,0,0}));
    }
}