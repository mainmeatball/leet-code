package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution859Test {

    final Solution859 solution = new Solution859();

    @Test
    void buddyStrings() {
        assertTrue(solution.buddyStrings("ab", "ba"));
    }

    @Test
    void buddyStrings2() {
        assertFalse(solution.buddyStrings("ab", "ab"));
    }

    @Test
    void buddyStrings3() {
        assertTrue(solution.buddyStrings("aa", "aa"));
    }
}