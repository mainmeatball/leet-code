package org.leetcode.problem;

/**
 * Container With Most Water
 */
public class Solution11 {
    public int maxArea(final int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            final int distance = right - left;
            final int newArea = Math.min(height[left], height[right]) * distance;
            maxArea = Math.max(maxArea, newArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
