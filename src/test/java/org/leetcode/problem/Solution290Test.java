package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution290Test {

    final Solution290 solution = new Solution290();

    @Test
    void wordPattern() {
        final String pattern = "abba";
        final String s = "cat dog dog cat";

        final boolean isPattern = solution.wordPattern(pattern, s);

        assertTrue(isPattern);
    }

    @Test
    void wordPattern2() {
        final String pattern = "abba";
        final String s = "cat dog dog2 cat";

        final boolean isPattern = solution.wordPattern(pattern, s);

        assertFalse(isPattern);
    }

    @Test
    void wordPattern3() {
        final String pattern = "abca";
        final String s = "cat dog dog2 cat";

        final boolean isPattern = solution.wordPattern(pattern, s);

        assertTrue(isPattern);
    }

    @Test
    void wordPattern4() {
        final String pattern = "abba";
        final String s = "dog dog dog dog";

        final boolean isPattern = solution.wordPattern(pattern, s);

        assertFalse(isPattern);
    }
}