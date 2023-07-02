package org.leetcode.problem;


/**
 * Maximum Value at a Given Index in a Bounded Array
 */
public class Solution1802 {
    public int maxValue(int n, int index, int maxSum) {
        int result = 0;
        maxSum -= n;
        int inc = 1;
        result = 1;
        int min = Math.min(index, n - index - 1);
        while (maxSum > 0) {
            if (maxSum < inc) {
                return result;
            }
            if (inc >= n) {
                return result + maxSum / inc;
            }
            maxSum -= inc;
            inc += (result <= min) ? 2 : 1;
            result++;
            inc = Math.min(inc, n);
        }
        return result;
    }
}
