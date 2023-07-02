package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution2101Test {

    final Solution2101 solution = new Solution2101();

    @Test
    void maximumDetonation1() {
        int[][] bombs = new int[][] {
                {1, 2, 3},
                {2, 3, 1},
                {3, 4, 2},
                {4, 5, 3},
                {5, 6, 4}
        };

        final int result = solution.maximumDetonation(bombs);

        assertEquals(5, result);
    }

    @Test
    void maximumDetonation2() {
        int[][] bombs = new int[][] {
                {1, 1, 5},
                {10, 10, 5}
        };

        final int result = solution.maximumDetonation(bombs);

        assertEquals(1, result);
    }

    @Test
    void maximumDetonation3() {
        int[][] bombs = new int[][] {
                {2, 1, 3},
                {6, 1, 4}
        };

        final int result = solution.maximumDetonation(bombs);

        assertEquals(2, result);
    }

    @Test
    void maximumDetonation4() {
        int[][] bombs = new int[][] {
                {1, 1, 100000},
                {100000, 100000, 1}
        };

        final int result = solution.maximumDetonation(bombs);

        assertEquals(1, result);
    }
}