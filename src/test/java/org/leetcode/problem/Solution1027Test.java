package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1027Test {

    final Solution1027 solution = new Solution1027();

    @Test
    void longestArithSeqLength() {
        final int result = solution.longestArithSeqLength(new int[] {3,6,9,12});

        assertEquals(4, result);
    }

    @Test
    void longestArithSeqLength2() {
        final int result = solution.longestArithSeqLength(new int[] {9,4,7,2,10});

        assertEquals(3, result);
    }

    @Test
    void longestArithSeqLength3() {
        final int result = solution.longestArithSeqLength(new int[] {20,1,15,3,10,5,8});

        assertEquals(4, result);
    }
}