package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution62Test {

    final Solution62 solution = new Solution62();

    @Test
    void uniquePaths() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void uniquePaths2() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }
}