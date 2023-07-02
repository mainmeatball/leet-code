package org.leetcode.problem;


/**
 * Minimum Falling Path Sum
 */
public class Solution931 {

    public int minFallingPathSum(int[][] matrix) {
        final int length = matrix.length;
        final int[][] minMatrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                minMatrix[i][j] = 101;
            }
        }

        // initialize last row of min matrix
        System.arraycopy(matrix[length - 1], 0, minMatrix[length - 1], 0, length);

        // start with 2nd last row
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                final int minOfLowLeft = j == 0 ? minMatrix[i + 1][j] : minMatrix[i + 1][j - 1];
                final int minOfLowStraight = minMatrix[i + 1][j];
                final int minOfLowRight = j == length - 1 ? minMatrix[i + 1][j] : minMatrix[i + 1][j + 1];
                minMatrix[i][j] = Math.min(Math.min(minOfLowLeft, minOfLowStraight), minOfLowRight) + matrix[i][j];
            }
        }

        int min = minMatrix[0][0];

        for (int j = 0; j < length; j++) {
            if (minMatrix[0][j] < min) {
                min = minMatrix[0][j];
            }
        }

        return min;
    }
}
