package org.leetcode.problem;


/**
 * Delete and Earn
 */
public class Solution740 {
    public int deleteAndEarn(int[] nums) {
        final int[] dp = new int[10001];
        for (final int num : nums) {
            dp[num] += num;
        }
        dp[2] += dp[0];
        for (int i = 3; i < dp.length; i++) {
            dp[i] += Math.max(dp[i-2], dp[i-3]);
        }
        return Math.max(dp[9999], dp[10000]);
    }
}
