package org.leetcode.problem;

/**
 * Reshape the Matrix
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        final int[][] newMat = new int[r][c];
        int n = 0, m = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[n][m] = mat[i][j];
                m++;
                if (m >= c) {
                    n++;
                    m = 0;
                }
            }
        }
        return newMat;
    }
}
