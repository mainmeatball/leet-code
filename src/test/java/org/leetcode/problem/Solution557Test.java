package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution557Test {

    final Solution557 solution = new Solution557();

    @Test
    void reverseWords() {
        final String s = "Let's take LeetCode contest";

        final String result = solution.reverseWords(s);

        System.out.println(result);
    }
}