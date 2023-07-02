package org.leetcode.problem;

import java.util.Arrays;
import java.util.Comparator;


/**
 * Minimum Number of Arrows to Burst Balloons
 */
public class Solution452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int minShots = 0;
        int prevxStart = points[0][0];
        int prevxEnd = points[0][1];
        for (final int[] point : points) {
            final int xStart = point[0];
            final int xEnd = point[1];
            final boolean isIntersection = isIntersection(prevxStart, prevxEnd, xStart);
            prevxStart = Math.max(xStart, prevxStart);
            if (isIntersection) {
                prevxEnd = Math.min(xEnd, prevxEnd);
            } else {
                prevxEnd = xEnd;
                minShots++;
            }
        }
        return minShots + 1;
    }

    private boolean isIntersection(final int xs1, final int xe1, final int xs2) {
        return xs2 >= xs1 && xs2 <= xe1;
    }
}
