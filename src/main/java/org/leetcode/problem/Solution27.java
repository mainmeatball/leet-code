package org.leetcode.problem;

/**
 * Remove Element
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
