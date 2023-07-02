package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution976Test {

    final Solution976 solution = new Solution976();

    @Test
    void largestPerimeter1() {
        final int[] nums = new int[]{2,1,2};

        final int result = solution.largestPerimeter(nums);

        assertEquals(5, result);
    }

    @Test
    void largestPerimeter2() {
        final int[] nums = new int[]{1,2,1,10};

        final int result = solution.largestPerimeter(nums);

        assertEquals(0, result);
    }
}