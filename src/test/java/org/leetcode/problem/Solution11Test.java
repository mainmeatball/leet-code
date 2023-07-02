package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author sstepanov
 */
class Solution11Test {

    final Solution11 solution = new Solution11();

    @Test
    void test() {
        final int maxArea = solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        assertEquals(49, maxArea);
    }

    @Test
    void test2() {
        final int maxArea = solution.maxArea(new int[]{1,2,3,4,5,25,24,3,4});
        assertEquals(24, maxArea);
    }
}