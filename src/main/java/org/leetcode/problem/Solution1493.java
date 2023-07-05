package org.leetcode.problem;

/**
 * Longest Subarray of 1's After Deleting One Element
 */
public class Solution1493 {
    public int longestSubarray(int[] nums) {
        boolean onlyOnes = true;
        int maxOnes = 0, currentOnes1 = 0, currentOnes2 = 0, currentZeroes = 0;
        for (final int num : nums) {
            if (num == 1) {
                if ((currentZeroes == 1 && currentOnes1 > 0) || currentOnes2 > 0) {
                    currentOnes2++;
                }
                currentOnes1++;
                maxOnes = Math.max(currentOnes1, maxOnes);
                currentZeroes = 0;
            } else {
                if (currentOnes2 > 0) {
                    currentOnes1 = currentOnes2;
                    currentOnes2 = 0;
                }
                currentZeroes++;
                if (currentZeroes == 2) {
                    currentOnes1 = 0;
                    currentOnes2 = 0;
                }
                onlyOnes = false;
            }
        }
        if (onlyOnes) return nums.length - 1;
        return maxOnes;
    }
}
