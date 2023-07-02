package org.leetcode.problem;

/**
 * Running Sum of 1d Array
 */
public class Solution1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                nums[i] = nums[i-1] + nums[i];
            }
        }
        return nums;
    }
}
