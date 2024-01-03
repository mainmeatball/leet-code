package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution2390Test {

    final Solution2390 solution = new Solution2390();

    @Test
    void removeStars() {
        assertEquals("lecoe", solution.removeStars("leet**cod*e"));
    }

    @Test
    void removeStars2() {
        assertEquals("", solution.removeStars("erase*****"));
    }
}