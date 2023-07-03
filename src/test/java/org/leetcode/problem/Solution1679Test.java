package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1679Test {

    final Solution1679 solution = new Solution1679();

    @Test
    void maxOperations() {
        assertEquals(2, solution.maxOperations(new int[]{1,2,3,4}, 5));
    }

    @Test
    void maxOperations2() {
        assertEquals(1, solution.maxOperations(new int[]{3,1,3,4,3}, 6));
    }
}