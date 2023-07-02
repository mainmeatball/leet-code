package org.leetcode.problem;

/**
 * Matrix Diagonal Sum
 */
public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int x = -1, y = -1;
        if (mat.length % 2 == 1) {
            x = mat.length / 2;
            y = mat.length / 2;
        }
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[mat.length - i - 1][i];
        }
        if (x != -1) {
            sum -= mat[x][y];
        }
        return sum;
    }
}
