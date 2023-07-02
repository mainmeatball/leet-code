package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution605Test {

    final Solution605 solution = new Solution605();

    @Test
    void canPlaceFlowers() {
        assertTrue(solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    }

    @Test
    void canPlaceFlowers2() {
        assertFalse(solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
    }
}