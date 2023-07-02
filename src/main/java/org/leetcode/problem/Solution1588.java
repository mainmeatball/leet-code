package org.leetcode.problem;

/**
 * Sum of All Odd Length Subarrays
 */
public class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * getSum(i, arr.length);
        }
        return sum;
    }

    private int getSum(final int i, final int n) {
        final int before = i + 1;
        final int after = n - i;
        return (before * after + 1) / 2;
    }
}
