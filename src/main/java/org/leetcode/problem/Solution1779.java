package org.leetcode.problem;

/**
 * Find Nearest Point That Has the Same X or Y Coordinate
 */
public class Solution1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = points.length - 1; i >= 0; i--) {
            final int px = points[i][0];
            final int py = points[i][1];
            if (px != x && py != y) {
                continue;
            }
            final int md = Math.abs(x - px) + Math.abs(y - py);
            if (md <= minDistance) {
                minDistance = md;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
