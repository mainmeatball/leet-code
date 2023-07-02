package org.leetcode.problem;

/**
 * Count Odd Numbers in an Interval Range
 */
public class Solution1523 {
    public int countOdds(int low, int high) {
        final boolean lowIsOdd = low % 2 == 1;
        final boolean highIsOdd = high % 2 == 1;
        return ((high - low) / 2) + ((lowIsOdd || highIsOdd) ? 1 : 0);
    }
}
