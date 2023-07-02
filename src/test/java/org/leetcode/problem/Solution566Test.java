package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution566Test {

    final Solution566 solution = new Solution566();

    @Test
    void matrixReshape() {
        final int[][] mat = new int[][]{{1,2},{3,4}};

        final int[][] result = solution.matrixReshape(mat, 1, 4);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println(" ");
        }
    }

    @Test
    void matrixReshape1() {
        final int[][] mat = new int[][]{{1,2},{3,4}};

        final int[][] result = solution.matrixReshape(mat, 4, 1);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println(" ");
        }
    }
}