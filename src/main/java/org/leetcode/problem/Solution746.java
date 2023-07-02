package org.leetcode.problem;


/**
 * Min Cost Climbing Stairs
 */
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 2], cost[i - 1]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
