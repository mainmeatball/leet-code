package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution303Test {

    @Test
    public void sumRange() {
        final int[] arr = new int[]{-2, 0, 3, -5, 2, -1};
        final Solution303.NumArray numArray = new Solution303.NumArray(arr);

        final int result1 = numArray.sumRange(0, 2);
        final int result2 = numArray.sumRange(2, 5);
        final int result3 = numArray.sumRange(0, 5);

        assertEquals(1, result1);
        assertEquals(-1, result2);
        assertEquals(-3, result3);
    }
}