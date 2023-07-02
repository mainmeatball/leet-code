package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution64Test {

    final Solution64 solution = new Solution64();

    @Test
    void minPathSum() {
        final int[][] matrix = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        final int result = solution.minPathSum(matrix);

        assertEquals(7, result);
    }

    @Test
    void minPathSum2() {
        final int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6}
        };
        final int result = solution.minPathSum(matrix);

        assertEquals(12, result);
    }
}