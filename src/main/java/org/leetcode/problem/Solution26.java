package org.leetcode.problem;

/**
 * Remove Duplicates from Sorted Array
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        for (; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
