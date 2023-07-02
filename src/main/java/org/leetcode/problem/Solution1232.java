package org.leetcode.problem;

/**
 * Check If It Is a Straight Line
 */
public class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        final int x1 = coordinates[0][0];
        final int y1 = coordinates[0][1];
        final int x2 = coordinates[1][0];
        final int y2 = coordinates[1][1];
        final double lineStandard = (double)(x2 - x1) / (double)(y2 - y1);
        final boolean sameX = x2 - x1 == 0;
        final boolean sameY = y2 - y1 == 0;
        for (int i = 2; i < coordinates.length; i++) {
            final int x = coordinates[i][0];
            final int y = coordinates[i][1];
            if (sameX && x - x1 != 0) {
                return false;
            }
            if (sameY && y - y1 != 0) {
                return false;
            }
            if (sameX || sameY) {
                continue;
            }
            final double curLine = (double)(x - x1) / (double)(y - y1);
            if (curLine != lineStandard) {
                return false;
            }
        }
        return true;
    }
}
