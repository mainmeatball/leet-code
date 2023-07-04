package org.leetcode.problem;

/**
 * Single Number II
 */
public class Solution137 {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for (final int num : nums) {
            int tempOne = (one ^ num) & ~two;
            int tempTwo = (one & num) | ~num & two;
            one = tempOne;
            two = tempTwo;
        }
        return one;
    }
}
