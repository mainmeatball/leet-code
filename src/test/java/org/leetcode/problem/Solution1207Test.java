package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1207Test {

    final Solution1207 solution = new Solution1207();

    @Test
    void uniqueOccurrences() {
        assertTrue(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}