package org.leetcode.problem;

/**
 * Climbing Stairs
 */
public class Solution70 {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int one = 2, two = 1;
        for (int i = 0; i < n - 2; i++) {
            one += two;
            two = one - two;
        }
        return one;
    }

}
