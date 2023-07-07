package org.leetcode.problem;

/**
 * Find Pivot Index
 */
public class Solution724 {
    public int pivotIndex(int[] nums) {
        final int[] sumsL = new int[nums.length];
        final int[] sumsR = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sumsL[i] = 0;
                continue;
            }
            sumsL[i] = sumsL[i-1] + nums[i-1];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            if (i == nums.length-1) {
                sumsR[i] = 0;
                continue;
            }
            sumsR[i] = sumsR[i+1] + nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumsL[i] == sumsR[i]) {
                return i;
            }
        }

        return -1;
    }
}
