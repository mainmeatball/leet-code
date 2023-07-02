package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1768Test {

    final Solution1768 solution = new Solution1768();

    @Test
    void mergeAlternately() {
        final String word1 = "abc";
        final String word2 = "dbawef";

        final String result = solution.mergeAlternately(word1, word2);

        assertEquals("adbbacwef", result);
    }

    @Test
    void mergeAlternately2() {
        final String word1 = "dbawef";
        final String word2 = "abc";

        final String result = solution.mergeAlternately(word1, word2);

        assertEquals("adbbacwef", result);
    }
}