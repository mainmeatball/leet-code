package org.leetcode.problem;

import java.util.Arrays;


/**
 * Largest Perimeter Triangle
 */
public class Solution976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i - 2 >= 0; i--) {
            final int a = nums[i];
            final int b = nums[i - 1];
            final int c = nums[i - 2];
            if (c < a + b && b < a + c && a < b + c) {
                return a + b + c;
            }
        }
        return 0;
    }
}
