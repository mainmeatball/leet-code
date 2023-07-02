package org.leetcode.problem;


/**
 * Increasing Triplet Subsequence
 */
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max3) max3 = nums[i];
            if (nums[i] < max3 && nums[i] > max2) max2 = nums[i];
            if (nums[i] < max3 && nums[i] < max2) return true;
        }
        return false;
    }
}
