package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution134Test {

    final Solution134 solution = new Solution134();

    @Test
    void canCompleteCircuit() {
        final int[] gas = new int[]{4,4,4,4,4,4};
        final int[] cost = new int[]{1,5,7,2,3,6};

        final int result = solution.canCompleteCircuit(gas, cost);

        assertEquals(3, result);
    }

    @Test
    void canCompleteCircuit2() {
        final int[] gas = new int[]{1,2,3,4,5};
        final int[] cost = new int[]{3,4,5,1,2};

        final int result = solution.canCompleteCircuit(gas, cost);

        assertEquals(3, result);
    }

    @Test
    void canCompleteCircuit3() {
        final int[] gas = new int[]{2,3,4};
        final int[] cost = new int[]{3,4,3};

        final int result = solution.canCompleteCircuit(gas, cost);

        assertEquals(-1, result);
    }
}