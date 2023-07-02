package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution886Test {

    final Solution886 solution = new Solution886();

    @Test
    void possibleBipartition1() {
        final int[][] dislikes = new int[][] {
                {1,2},
                {1,3},
                {2,4}
        };

        final boolean result = solution.possibleBipartition(4, dislikes);

        assertTrue(result);
    }

    @Test
    void possibleBipartition2() {
        final int[][] dislikes = new int[][] {
                {1,2},
                {1,3},
                {2,3}
        };

        final boolean result = solution.possibleBipartition(3, dislikes);

        assertFalse(result);
    }

    @Test
    void possibleBipartition3() {
        final int[][] dislikes = new int[][] {
                {1,2},
                {2,3},
                {3,4},
                {4,5},
                {1,5}
        };

        final boolean result = solution.possibleBipartition(5, dislikes);

        assertFalse(result);
    }
}