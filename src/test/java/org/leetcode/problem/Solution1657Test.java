package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1657Test {

    final Solution1657 solution = new Solution1657();

    @Test
    void closeStrings1() {
        final boolean result = solution.closeStrings("abc", "bca");

        assertTrue(result);
    }

    @Test
    void closeStrings2() {
        final boolean result = solution.closeStrings("a", "aa");

        assertFalse(result);
    }

    @Test
    void closeStrings3() {
        final boolean result = solution.closeStrings("cabbba", "abbccc");

        assertTrue(result);
    }

    @Test
    void closeStrings4() {
        final boolean result = solution.closeStrings("uau", "ssx");

        assertFalse(result);
    }
}