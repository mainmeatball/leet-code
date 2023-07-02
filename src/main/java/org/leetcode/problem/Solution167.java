package org.leetcode.problem;

/**
 * Two Sum II - Input Array Is Sorted
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i < j;) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i, j};
            }
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
