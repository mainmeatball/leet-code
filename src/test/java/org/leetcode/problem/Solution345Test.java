package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution345Test {

    final Solution345 solution = new Solution345();

    @Test
    void reverseVowels() {
        assertEquals("holle", solution.reverseVowels("hello"));
    }

    @Test
    void reverseVowels2() {
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}