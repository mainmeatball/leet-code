package org.leetcode.problem;

import java.util.Arrays;


/**
 * 3Sum Closest
 */
public class Solution16 {

    public int threeSumClosest(final int[] nums, final int target) {
        Arrays.sort(nums);
        int maxSum = 0;
        int closestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
                final int newSum = nums[i] + nums[k] + nums[j];
                final int diff = Math.abs(target - newSum);
                if (diff < closestDiff) {
                    closestDiff = diff;
                    maxSum = newSum;
                }
                if (target == newSum) {
                    return target;
                } else if (newSum < target) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return maxSum;
    }
}
