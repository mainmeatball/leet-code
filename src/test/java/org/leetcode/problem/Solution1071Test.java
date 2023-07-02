package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1071Test {

    final Solution1071 solution = new Solution1071();

    @Test
    void gcdOfStrings() {
        final String result = solution.gcdOfStrings("ABCABC", "ABC");

        assertEquals("ABC", result);
    }

    @Test
    void gcdOfStrings2() {
        final String result = solution.gcdOfStrings("ABABAB", "ABAB");

        assertEquals("AB", result);
    }

    @Test
    void gcdOfStrings3() {
        final String result = solution.gcdOfStrings("LEET", "CODE");

        assertEquals("", result);
    }

    @Test
    void gcdOfStrings4() {
        final String result = solution.gcdOfStrings("ABCDAB", "ABCD");

        assertEquals("", result);
    }
}