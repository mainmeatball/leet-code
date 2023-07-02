package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution2244Test {

    final Solution2244 solution = new Solution2244();

    @Test
    void minimumRounds() {
        final int[] tasks = new int[]{2,2,3,3,2,4,4,4,4,4};

        final int result = solution.minimumRounds(tasks);

        assertEquals(4, result);
    }

    @Test
    void minimumRounds2() {
        final int[] tasks = new int[]{2,3,3};

        final int result = solution.minimumRounds(tasks);

        assertEquals(-1, result);
    }

    @Test
    void minimumRounds3() {
        final int[] tasks = new int[]{1,1000000000};

        final int result = solution.minimumRounds(tasks);

        assertEquals(-1, result);
    }
}