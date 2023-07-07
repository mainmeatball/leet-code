package org.leetcode.problem;

/**
 * Max Consecutive Ones III
 */
class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int max = 0, zeroes = 0;
        for (int left = 0, right = 0; right < nums.length;) {
            if (zeroes <= k) {
                right++;
                if (nums[right - 1] == 0) zeroes++;
            } else {
                left++;
                if (nums[left - 1] == 0) zeroes--;
            }
            int ones = (right - left) - zeroes;
            max = Math.max(ones + Math.min(zeroes, k), max);
        }
        return max;
    }
}
