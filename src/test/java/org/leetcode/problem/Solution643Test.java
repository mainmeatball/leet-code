package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution643Test {

    final Solution643 solution = new Solution643();

    @Test
    void findMaxAverage() {
        assertEquals(12.75, solution.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    @Test
    void findMaxAverage2() {
        assertEquals(5, solution.findMaxAverage(new int[]{5}, 1));
    }

    @Test
    void findMaxAverage3() {
        assertEquals(-1, solution.findMaxAverage(new int[]{-1}, 1));
    }
}