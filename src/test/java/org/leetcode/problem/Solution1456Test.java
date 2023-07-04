package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1456Test {

    final Solution1456 solution = new Solution1456();

    @Test
    void maxVowels() {
        assertEquals(3, solution.maxVowels("abciiidef", 3));
    }

    @Test
    void maxVowels2() {
        assertEquals(2, solution.maxVowels("aeiou", 2));
    }

    @Test
    void maxVowels3() {
        assertEquals(2, solution.maxVowels("leetcode", 3));
    }
}