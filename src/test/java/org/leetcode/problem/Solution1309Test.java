package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1309Test {

    final Solution1309 solution = new Solution1309();

    @Test
    void freqAlphabets() {
        final String s = "10#11#12";

        final String result = solution.freqAlphabets(s);

        assertEquals("jkab", result);
    }

    @Test
    void freqAlphabets2() {
        final String s = "1326#";

        final String result = solution.freqAlphabets(s);

        assertEquals("acz", result);
    }
}