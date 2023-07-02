package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution953Test {

    final Solution953 solution = new Solution953();

    @Test
    void isAlienSorted() {
        final String[] words = new String[]{"hello","leetcode"};
        final String order = "hlabcdefgijkmnopqrstuvwxyz";

        final boolean result = solution.isAlienSorted(words, order);

        assertTrue(result);
    }

    @Test
    void isAlienSorted2() {
        final String[] words = new String[]{"word","world","row"};
        final String order = "worldabcefghijkmnpqstuvxyz";

        final boolean result = solution.isAlienSorted(words, order);

        assertFalse(result);
    }

    @Test
    void isAlienSorted3() {
        final String[] words = new String[]{"apple","app"};
        final String order = "abcdefghijklmnopqrstuvwxyz";

        final boolean result = solution.isAlienSorted(words, order);

        assertFalse(result);
    }
}