package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution944Test {

    final Solution944 solution = new Solution944();

    @Test
    void minDeletionSize() {
        final String[] strs = new String[]{"cba","daf","ghi"};

        final int result = solution.minDeletionSize(strs);

        assertEquals(1, result);
    }

    @Test
    void minDeletionSize2() {
        final String[] strs = new String[]{"a","b"};

        final int result = solution.minDeletionSize(strs);

        assertEquals(0, result);
    }

    @Test
    void minDeletionSize3() {
        final String[] strs = new String[]{"zyx","wvu","tsr"};

        final int result = solution.minDeletionSize(strs);

        assertEquals(3, result);
    }
}