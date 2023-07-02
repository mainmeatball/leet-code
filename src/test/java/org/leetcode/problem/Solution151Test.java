package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution151Test {

    final Solution151 solution = new Solution151();

    @Test
    void reverseWords() {
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }

    @Test
    void reverseWords2() {
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }

    @Test
    void reverseWords3() {
        assertEquals("example good a", solution.reverseWords("a good   example"));
    }
}