package org.leetcode.problem;

/**
 * Word Pattern
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
        while(i < nums.length) {
            nums[i++] = 0;
        }
    }
}
