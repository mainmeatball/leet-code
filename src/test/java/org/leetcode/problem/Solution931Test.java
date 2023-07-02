package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class Solution931Test {

    private final Solution931 solution = new Solution931();

    @Test
    void minFallingPathSum13() {
        final int[][] matrix = new int[][] {{2,1,3},{6,5,4},{7,8,9}};

        final int result = solution.minFallingPathSum(matrix);

        System.out.println(result);
        assertEquals(13, result);
    }

    @Test
    void minFallingPathSumNeg59() {
        final int[][] matrix = new int[][] {{-19,57},{-40,-5}};

        final int result = solution.minFallingPathSum(matrix);

        System.out.println(result);
        assertEquals(-59, result);
    }
}