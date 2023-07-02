package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1588Test {

    final Solution1588 solution = new Solution1588();

    @Test
    void sumOddLengthSubarrays() {
        final int[] array = new int[]{1,4,2,5,3};

        final int result = solution.sumOddLengthSubarrays(array);

        assertEquals(58, result);
    }

    @Test
    void sumOddLengthSubarrays2() {
        final int[] array = new int[]{1,2};

        final int result = solution.sumOddLengthSubarrays(array);

        assertEquals(3, result);
    }

    @Test
    void sumOddLengthSubarrays3() {
        final int[] array = new int[]{10,11,12};

        final int result = solution.sumOddLengthSubarrays(array);

        assertEquals(66, result);
    }

    @Test
    void sumOddLengthSubarrays4() {
        final int[] array = new int[]{7,6,8,6};

        final int result = solution.sumOddLengthSubarrays(array);

        assertEquals(68, result);
    }
}