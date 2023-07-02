package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1572Test {

    final Solution1572 solution = new Solution1572();

    @Test
    void diagonalSum() {
        final int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        final int result = solution.diagonalSum(matrix);

        assertEquals(25, result);
    }

    @Test
    void diagonalSum2() {
        final int[][] matrix = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};

        final int result = solution.diagonalSum(matrix);

        assertEquals(8, result);
    }

    @Test
    void diagonalSum3() {
        final int[][] matrix = new int[][]{{5}};

        final int result = solution.diagonalSum(matrix);

        assertEquals(5, result);
    }
}