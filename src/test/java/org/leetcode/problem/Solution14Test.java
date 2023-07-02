package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution14Test {

    private final Solution14 solution = new Solution14();

    @Test
    void test() {
        final String[] strs = new String[] {"flower","flow","flight"};
        final String longestCommonPrefix = solution.longestCommonPrefix(strs);
        assertEquals("fl", longestCommonPrefix);
    }

    @Test
    void test2() {
        final String[] strs = new String[] {"dog","racecar","car"};
        final String longestCommonPrefix = solution.longestCommonPrefix(strs);
        assertEquals("", longestCommonPrefix);
    }
}