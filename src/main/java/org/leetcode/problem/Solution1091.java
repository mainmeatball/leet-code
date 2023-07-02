package org.leetcode.problem;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Shortest Path in Binary Matrix - BFS solution.
 */
class Solution1091 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});

        while (!q.isEmpty()) {
            final int[] vertex = q.poll();

            final int row = vertex[0];
            final int col = vertex[1];
            final int len = vertex[2];
            final int hash = row + col * 100;
            if (row == grid.length - 1 && col == grid.length - 1) {
                return len;
            }
            if (grid[row][col] == 1) {
                continue;
            }

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    final int nextRow = row + i;
                    final int nextCol = col + j;
                    if (Math.min(nextRow, nextCol) < 0 || Math.max(nextRow, nextCol) >= grid.length) {
                        continue;
                    }
                    q.add(new int[] {nextRow, nextCol, len + 1});
                    grid[row][col] = 1;
                }
            }
        }
        return -1;
    }
}

///**
// * Shortest Path in Binary Matrix - recursive solution (timeout).
// */
//class Solution1091 {
//    public int shortestPathBinaryMatrix(int[][] grid) {
//        if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
//            return -1;
//        }
//        final int[][] visited = new int[grid.length][grid.length];
//        doTraversal(grid, visited, 0, 0, 1);
//        final int res = visited[grid.length - 1][grid.length - 1];
//        return res == 0 ? -1 : res;
//    }
//
//    private void doTraversal(int[][] grid, int[][] visited, int i, int j, int length) {
//        if (Math.min(i, j) < 0 || Math.max(i, j) >= grid.length) {
//            return;
//        }
//        if (i == grid.length - 1 && j == grid.length - 1) {
//            visited[i][j] = length;
//            return;
//        }
//        if (visited[i][j] != 0 && visited[i][j] <= length) {
//            return;
//        }
//        if (grid[i][j] != 0) {
//            return;
//        }
//        visited[i][j] = length;
//
//        int[] a = new int[] {-1, 0, 1};
//        int[] b = new int[] {-1, 0, 1};
//        for (int k = 0; k < 3; k++) {
//            for (int m = 0; m < 3; m++) {
//                if (a[k] == 0 && b[m] == 0) continue;
//                doTraversal(grid, visited, i + a[k], j + b[m], length + 1);
//            }
//        }
//    }
//}
