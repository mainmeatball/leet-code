package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution567Test {

    final Solution567 solution = new Solution567();

    @Test
    void checkInclusion() {
        final String s1 = "ab";
        final String s2 = "eidbaooo";

        final boolean result = solution.checkInclusion(s1, s2);

        assertTrue(result);
    }

    @Test
    void checkInclusion2() {
        final String s1 = "ab";
        final String s2 = "eidboaoo";

        final boolean result = solution.checkInclusion(s1, s2);

        assertFalse(result);
    }

    @Test
    void checkInclusion3() {
        final String s1 = "adc";
        final String s2 = "dcda";

        final boolean result = solution.checkInclusion(s1, s2);

        assertTrue(result);
    }

    @Test
    void checkInclusion4() {
        final String s1 = "abc";
        final String s2 = "bbbca";

        final boolean result = solution.checkInclusion(s1, s2);

        assertTrue(result);
    }
}