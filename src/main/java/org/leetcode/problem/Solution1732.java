package org.leetcode.problem;

/**
 * Find the Highest Altitude
 */
public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int max = 0, curr = 0;
        for (final int i : gain) {
            curr += i;
            max = Math.max(curr, max);
        }
        return max;
    }
}
