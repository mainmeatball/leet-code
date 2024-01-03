package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution735Test {

    final Solution735 solution = new Solution735();

    @Test
    void asteroidCollision() {
        final int[] result = solution.asteroidCollision(new int[] {5,10,-5});

        assertArrayEquals(new int[]{5,10}, result);
    }

    @Test
    void asteroidCollision2() {
        final int[] result = solution.asteroidCollision(new int[] {8,-8});

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void asteroidCollision3() {
        final int[] result = solution.asteroidCollision(new int[] {10,2,-5});

        assertArrayEquals(new int[]{10}, result);
    }
}