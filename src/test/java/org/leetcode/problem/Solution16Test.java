package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution16Test {

    private final Solution16 solution = new Solution16();

    @Test
    void test() {
        final int[] nums = new int[] {-1,2,1,-4};
        final int sum = solution.threeSumClosest(nums, 1);
        assertEquals(2, sum);
    }
}