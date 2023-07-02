package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution18Test {

    private final Solution18 solution = new Solution18();

    @Test
    void test() {
        final int[] nums = new int[] {1,0,-1,0,-2,2};
        final var sum = solution.fourSum(nums, 0);
        assertEquals(List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)), sum);
    }

    @Test
    void test2() {
        final int[] nums = new int[] {2,2,2,2,2};
        final var sum = solution.fourSum(nums, 8);
        assertEquals(List.of(List.of(2,2,2,2)), sum);
    }

    @Test
    void test3() {
        final int[] nums = new int[] {-2,-1,-1,1,1,2,2};
        final var sum = solution.fourSum(nums, 0);
        assertEquals(List.of(List.of(-2,-1,1,2), List.of(-1,-1,1,1)), sum);
    }
}