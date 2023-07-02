package org.leetcode.problem;


import java.util.Arrays;
import java.util.Comparator;


/**
 * Sort Integers by The Number of 1 Bits
 */
public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(
                        Comparator
                                .comparingInt(Integer::bitCount)
                                .thenComparing(Integer::compare)
                )
                .mapToInt(i -> i)
                .toArray();
    }
}
