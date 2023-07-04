package org.leetcode.problem;

/**
 * Maximum Average Subarray I
 */
public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double avg, max = -1000000;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = (double) sum / k;
        if (avg > max) max = avg;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            avg = (double) sum / k;
            if (avg > max) max = avg;
        }
        return max;
    }
}
