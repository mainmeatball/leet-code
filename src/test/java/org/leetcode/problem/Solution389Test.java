package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution389Test {

    final Solution389 solution = new Solution389();

    @Test
    void findTheDifference() {
        final String s1 = "abcd";
        final String s2 = "abcde";

        final char result = solution.findTheDifference(s1, s2);

        assertEquals('e', result);
    }

    @Test
    void findTheDifference2() {
        final String s1 = "abcde";
        final String s2 = "abde";

        final char result = solution.findTheDifference(s1, s2);

        assertEquals('c', result);
    }
}