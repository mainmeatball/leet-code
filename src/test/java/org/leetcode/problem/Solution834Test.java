package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution834Test {

    private final Solution834 solution = new Solution834();

    @Test
    void sumOfDistancesInTree() {
        final int n = 5;
        final int[][] edges = new int[][] {

        };

        final int[] result = solution.sumOfDistancesInTree(n, edges);

        for (final int i : result) {
            System.out.print(i + ",");
        }
    }
}