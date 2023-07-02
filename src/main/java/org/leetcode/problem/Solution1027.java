package org.leetcode.problem;

/**
 * Longest Arithmetic Subsequence
 */
class Solution1027 {

    public int longestArithSeqLength(int[] nums) {
        int max = 2;
        int curr = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i-2] - nums[i-1] == nums[i-1] - nums[i]) {
                curr++;
                max = Math.max(curr, max);
            } else {
                curr = 2;
            }
        }
        return max;
    }
}
